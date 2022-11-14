package MyStudyPlan;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
import java.awt.Color;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Logger;

import javax.swing.filechooser.FileSystemView;

import org.json.JSONException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Database {

    private static Database instance = null;
    private String username;
    private String password;
    private Vector<Subject> subjList;
    private Vector<TaskInstance> taskList;
    private Vector<ClassInstance> classList;
    private Vector<ExamInstance> examList;
    public static String path;

    // Create Gson Builder with custom serializer/deserializer
    private static Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new LocalDateSerializer())
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer())
            .registerTypeAdapter(LocalTime.class, new LocalTimeSerializer())
            .registerTypeAdapter(Color.class, new ColorSerializer())
            .registerTypeAdapter(LocalDate.class, new LocalDateDeserializer())
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer())
            .registerTypeAdapter(LocalTime.class, new LocalTimeDeserializer())
            .registerTypeAdapter(Color.class, new ColorDeserializer())
            .setPrettyPrinting()
            .create();

    private Database() throws JSONException {
        this.username = "";
        this.password = "";
        this.subjList = new Vector<Subject>();
        this.taskList = new Vector<TaskInstance>();
        this.classList = new Vector<ClassInstance>();
        this.examList = new Vector<ExamInstance>();
    }

    /**
     * @return Database
     */
    public static Database initDatabase() {
        // Detect OS
        String OS = System.getProperty("os.name").contains("Windows") ? "Windows" : "Unix";
        Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Detected OS: " + OS);
        switch (OS) {
            case "Windows":
                // Get Database path
                path = FileSystemView.getFileSystemView().getDefaultDirectory().getPath()
                        + "\\MyStudyPlan\\database.json";
                break;
            case "Unix":
                // Get Database path
                path = "~/Documents/MyStudyPlan/database.json";
                break;
        }
        instance = getDatabaseInstance(path);
        return instance;
    }

    /**
     * @param path
     * @return Database
     */
    private static Database getDatabaseInstance(String path) {
        Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO,
                "Database path: " + '"' + path + '"');
        // If file exist
        if (Files.exists(Path.of(path))) {
            // Read file
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO,
                    "Database file exists. Reading...");
            try {
                String json = Files.readString(Path.of(path));
                Database db = gson.fromJson(json, Database.class);
                if (db == null) {
                    throw new Exception("Database file is empty!");
                }
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO,
                        "Database read successfully.");
                return db;
            } catch (Exception e) {
                // write database file
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                        "Error reading database file! Writing new database file...", e);
                try {
                    Database db = new Database();

                    String json = gson.toJson(db);
                    Files.writeString(Path.of(path), json);
                    instance = db;
                } catch (Exception e2) {
                    Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                            "Error writing database file!", e);
                }
            }
        } else {
            // Create file
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO,
                    "Database file not found. Creating new database...");
            try {
                File file = new File(path);
                file.getParentFile().mkdirs();
                file.createNewFile();
                instance = new Database();
                String json = gson.toJson(instance);
                Files.writeString(Path.of(path), json);
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO,
                        "Successfully created new database file.");
            } catch (Exception e) {
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                        "Error creating database file!", e);
            }
        }
        return instance;
    }

    public static void write() {
        try {
            String json = gson.toJson(instance);
            Files.writeString(Path.of(path), json);
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Error writing database file!");
            throw new RuntimeException(e);
        }
        new Thread(() -> {
            FirebaseRTDB.pushDatabase();
        }).start();
    }

    public static void writeDatabase(String json) {
        try {
            Files.writeString(Path.of(path), json);
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Error writing database file!", e);
        }
    }

    public static Map<String, Object> readDatabase() {
        try {
            String json = Files.readString(Path.of(path));
            @SuppressWarnings("unchecked")
            Map<String, Object> map = gson.fromJson(json, Map.class);
            return map;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Error reading database file!", e);
            return null;
        }
    }

    /**
     * @return Database
     */
    public static Database getInstance() {
        try {
            return instance;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Error getting database instance!", e);
            return null;
        }
    }

    /**
     * Add a subject to the database
     *
     * @param subject
     * @return boolean
     */
    public static boolean addSubject(Subject subject) {
        if (instance.subjList.contains(subject)) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.WARNING, "Subject already exists!");
            return false;
        } else {
            instance.subjList.add(subject);
            try {
                Database.write();
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO,
                        "Subject added successfully.");
                return true;
            } catch (Exception e) {
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                        "Write to database failed!", e);
                return false;
            }
        }
    }

    /**
     * Add a task to the database
     *
     * @param task
     */
    public static void addTask(TaskInstance task) {
        try {
            instance.taskList.add(task);
            Database.write();
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Task added successfully.");
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to add task!", e);
            instance.taskList.remove(task);
        }
    }

    /**
     * Add a class to the database
     *
     * @param classInstance
     */
    public static void addClass(ClassInstance classInstance) {
        try {
            instance.classList.add(classInstance);
            Database.write();
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Class added successfully.");
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to add class!", e);
        }
    }

    /**
     * Add an exam to the database
     *
     * @param exam
     */
    public static void addExam(ExamInstance exam) {
        try {
            instance.examList.add(exam);
            Database.write();
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Exam added successfully.");
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to add exam!", e);
            instance.examList.remove(exam);
        }
    }

    /**
     * Add a user to the database
     *
     * @param username
     * @param password
     */
    public static void addCredential(String username, String password) {
        try {
            instance.username = username;
            instance.password = password;
            Database.write();
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Username added successfully.");
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to add username!", e);
            instance.username = null;
        }
    }

    /**
     * Remove a subject from the database
     *
     * @param subject
     */
    public static boolean removeSubject(Subject subject) {
        try {
            instance.subjList.remove(subject);
            Database.write();
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO,
                    "Subject removed successfully.");
            return true;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to remove subject!",
                    e);
            return false;
        }
    }

    /**
     * Remove a task from the database
     *
     * @param task
     */
    public static void removeTask(TaskInstance task) {
        try {
            instance.taskList.remove(task);
            Database.write();
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Task removed successfully.");
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to remove task!", e);
            instance.taskList.add(task);
        }
    }

    /**
     * Remove a class from the database
     *
     * @param classInstance
     */
    public static void removeClass(ClassInstance classInstance) {
        try {
            instance.classList.remove(classInstance);
            Database.write();
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Class removed successfully.");
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to remove class!",
                    e);
            instance.classList.add(classInstance);
        }
    }

    /**
     * Remove an exam from the database
     *
     * @param exam
     */
    public static void removeExam(ExamInstance exam) {
        try {
            instance.examList.remove(exam);
            Database.write();
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Exam removed successfully.");
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to remove exam!", e);
            instance.examList.add(exam);
        }
    }

    /**
     * Get the username from the database
     *
     * @return username
     */
    public String getUsername() {
        try {
            return username;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to get username!",
                    e);
            return null;
        }
    }

    /**
     * Get the password from the database
     *
     * @return password
     */
    public String getPassword() {
        try {
            return password;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to get password!",
                    e);
            return null;
        }
    }

    /**
     * Get the list of subjects in the database
     *
     * @return Vector<Subject>
     */
    public static Vector<Subject> getSubjList() {
        try {
            return instance.subjList;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to get subject list!", e);
            return null;
        }
    }

    /**
     * Get the list of tasks in the database
     *
     * @return Vector<TaskInstance>
     */
    public static Vector<TaskInstance> getTaskList() {
        try {
            return instance.taskList;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to get task list!",
                    e);
            return null;
        }
    }

    /**
     * Get the list of classes in the database
     *
     * @return Vector<ClassInstance>
     */
    public static Vector<ClassInstance> getClassList() {
        try {
            return instance.classList;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to get class list!",
                    e);
            return null;
        }
    }

    /**
     * Get the list of exams in the database
     *
     * @return Vector<ExamInstance>
     */
    public static Vector<ExamInstance> getExamList() {
        try {
            return instance.examList;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to get exam list!",
                    e);
            return null;
        }
    }

    public static void logout() {
        try {
            File file = new File(path);
            file.delete();
            instance = initDatabase();
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to logout!",
                    e);
        }
        Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Logout successful.");
    }
}
