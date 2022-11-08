//can all of you add this? JSON rulez
//https://search.maven.org/remotecontent?filepath=org/json/json/20220924/json-20220924.jar
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
import java.util.Vector;
import java.util.logging.Logger;

import javax.swing.filechooser.FileSystemView;

import org.json.JSONException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Database {

    private static Database instance = null;
    private String username;
    private Vector<Subject> subjList;
    private Vector<TaskInstance> taskList;
    private Vector<ClassInstance> classList;
    private Vector<ExamInstance> examList;

    private Database() throws JSONException {
        this.username = "";
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

        // Create Gson Builder with custom serializer/deserializer
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateSerializer());
        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer());
        gsonBuilder.registerTypeAdapter(LocalTime.class, new LocalTimeSerializer());
        gsonBuilder.registerTypeAdapter(Color.class, new ColorSerializer());
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer());
        gsonBuilder.registerTypeAdapter(LocalTime.class, new LocalTimeDeserializer());
        gsonBuilder.registerTypeAdapter(Color.class, new ColorDeserializer());

        switch (OS) {
            case "Windows":
                // Get Database path
                String pathWindows = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\MyStudyPlan\\database.json";
                instance = getDatabaseInstance(gsonBuilder, pathWindows);
                break;
            case "Unix":
                // Get Database path
                String pathUnix = "~/Documents/MyStudyPlan/database.json";
                instance = getDatabaseInstance(gsonBuilder, pathUnix);
                break;
        }
        return instance;
    }

    
    /** 
     * @param gsonBuilder
     * @param path
     * @return Database
     */
    private static Database getDatabaseInstance(GsonBuilder gsonBuilder, String path) {
        Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Database path: " + '"' + path + '"');
        // If file exist
        if (Files.exists(Path.of(path))) {
            // Read file
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Database file exists. Reading...");
            try {
                String json = Files.readString(Path.of(path));
                Database db = gsonBuilder.create().fromJson(json, Database.class);
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Database read successfully.");
                return db;
            } catch (Exception e) {
                // write database file
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Error reading database file! " + e + "\nWriting new database file...");
                try {
                    Database db = new Database();
                    Gson gson = gsonBuilder.setPrettyPrinting().create();
                    String json = gson.toJson(db);
                    Files.writeString(Path.of(path), json);
                    instance = db;
                } catch (Exception e2) {
                    Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Error writing database file! " + e2);
                }
            }
        } else {
            // Create file
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Database file not found. Creating new database...");
            try {
                File file = new File(path);
                file.getParentFile().mkdirs();
                file.createNewFile();
                instance = new Database();
                Gson gson = gsonBuilder.setPrettyPrinting().create();
                String json = gson.toJson(instance);
                Files.writeString(Path.of(path), json);
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.INFO, "Successfully created new database file.");
            } catch (Exception e) {
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, "Error creating database file! " + e);
            }
        }
        return instance;
    }

    /**
     * Add a username to the database
     *
     * @param username
     *
     */
    public void addUsername(String username) {
        this.username = username;
    }

    /**
     * Add a subject to the database
     *
     * @param subject
     *
     */
    public static void addSubject(Subject subject) {
        instance.subjList.add(subject);
    }

    /**
     * Add a task to the database
     *
     * @param task
     *
     */
    public static void addTask(TaskInstance task) {
        instance.taskList.add(task);
    }

    /**
     * Add a class to the database
     *
     * @param classInstance
     *
     */
    public static void addClass(ClassInstance classInstance) {
        instance.classList.add(classInstance);
    }

    /**
     * Add an exam to the database
     *
     * @param exam
     *
     */
    public static void addExam(ExamInstance exam) {
        instance.examList.add(exam);
    }

    /**
     * Remove a username from the database
     *
     * @param username
     *
     */
    public void removeUsername(String username) {
        this.username = null;
    }

    /**
     * Remove a subject from the database
     *
     * @param subject
     */
    public static void removeSubject(Subject subject) {
        instance.subjList.remove(subject);
    }

    /**
     * Remove a task from the database
     *
     * @param task
     */
    public static void removeTask(TaskInstance task) {
        instance.taskList.remove(task);
    }

    /**
     * Remove a class from the database
     *
     * @param classInstance
     */
    public static void removeClass(ClassInstance classInstance) {
        instance.classList.remove(classInstance);
    }

    /**
     * Remove an exam from the database
     *
     * @param exam
     */
    public static void removeExam(ExamInstance exam) {
        instance.examList.remove(exam);
    }

    /**
     * Get the username from the database
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Get the list of subjects in the database
     *
     * @return Vector<Subject>
     */
    public static Vector<Subject> getSubjList() {
        return instance.subjList;
    }

    /**
     * Get the list of tasks in the database
     *
     * @return Vector<TaskInstance>
     */
    public static Vector<TaskInstance> getTaskList() {
        return instance.taskList;
    }

    /**
     * Get the list of classes in the database
     *
     * @return Vector<ClassInstance>
     */
    public static Vector<ClassInstance> getClassList() {
        return instance.classList;
    }

    /**
     * Get the list of exams in the database
     *
     * @return Vector<ExamInstance>
     */
    public static Vector<ExamInstance> getExamList() {
        return instance.examList;
    }

}
