//can all of you add this? JSON rulez
//https://search.maven.org/remotecontent?filepath=org/json/json/20220924/json-20220924.jar
package MyStudyPlan;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Vector;

import javax.swing.filechooser.FileSystemView;

import org.json.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Database {

    private String username = "default";
    private static Database instance = null;
    private Vector<Subject> subjList = new Vector<Subject>();
    private Vector<TaskInstance> taskList = new Vector<TaskInstance>();
    private Vector<ClassInstance> classList = new Vector<ClassInstance>();
    private Vector<ExamInstance> examList = new Vector<ExamInstance>();

    private Database(String username) throws JSONException {
        this.username = username;
    }

    
    /** 
     * @return Database
     */
    public static Database initDatabase() {
        // Detect OS
        String OS = System.getProperty("os.name").contains("Windows") ? "Windows" : "Unix";
        System.out.println("Detected OS: " + OS);
        
        switch (OS) {
            case "Windows":
                // Get Database path
                String pathWindows = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\MyStudyPlan\\database.json";
                System.out.println("Database path: " + '"' + pathWindows + '"');
                // If file exist
                if (Files.exists(Path.of(pathWindows))) {
                    // Read file
                    System.out.println("Database file exist. Reading...");
                    try {
                        String json = Files.readString(Path.of(pathWindows));
                        JSONObject obj = new JSONObject(json);
                        Gson gson = new GsonBuilder().create();
                        Database db = gson.fromJson(obj.toString(), Database.class);
                        instance = db;
                    } catch (Exception e) {
                        System.out.println("Error reading database file! " + e);
                    }
                } else {
                    // Create file
                    System.out.println("Database file not found. Creating new database...");
                    try {
                        File file = new File(pathWindows);
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                        instance = new Database("default");
                        Gson gson = new GsonBuilder().setPrettyPrinting().create();
                        String json = gson.toJson(instance);
                        Files.writeString(Path.of(pathWindows), json);
                        System.out.println("Successfully created new database file.");
                    } catch (Exception e) {
                        System.out.println("Error creating database file! " + e);
                    }
                }
                break;
            case "Unix":
                // Get Database path
                String pathUnix = "~/Documents/MyStudyPlan/database.json";
                System.out.println("Database path: " + '"' + pathUnix + '"');
                // If file exist
                if (Files.exists(Path.of(pathUnix))) {
                    // Read file
                    System.out.println("Database file exist. Reading...");
                    try {
                        String json = Files.readString(Path.of(pathUnix));
                        JSONObject obj = new JSONObject(json);
                        Gson gson = new GsonBuilder().create();
                        Database db = gson.fromJson(obj.toString(), Database.class);
                        instance = db;
                    } catch (Exception e) {
                        System.out.println("Error reading database file! " + e);
                    }
                } else {
                    // Create file
                    System.out.println("Database file not found. Creating new database...");
                    try {
                        File file = new File(pathUnix);
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                        instance = new Database("default");
                        Gson gson = new GsonBuilder().setPrettyPrinting().create();
                        String json = gson.toJson(instance);
                        Files.writeString(Path.of(pathUnix), json);
                        System.out.println("Successfully created new database file.");
                    } catch (Exception e) {
                        System.out.println("Error creating database file! " + e);
                    }
                }
                break;
        }
        return instance;
    }
    // /**
    //  * Get the instance of the database If the database is not created, create a
    //  * new database with the given username
    //  *
    //  * @param username The username of the database
    //  *
    //  * @return The database
    //  */
    // public static Database getInstance(String username) {
    //     if (instance == null) {
    //         String rawjson = null;
    //         if (System.getProperty("os.name").contains("Windows")) {
    //             try {
    //                 rawjson = Files.readString(Path.of(FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\MyStudyPlan\\" + username + ".json"));
    //             } catch (Exception e) {
    //                 System.err.println(username + ".json not found!");
    //             }
    //         } else {
    //             try {
    //                 rawjson = Files.readString(Path.of("~/Documents/MyStudyPlan/" + username + ".json"));
    //             } catch (Exception e) {
    //                 System.err.println(username + ".json not found!");
    //             }
    //         }
    //         if (rawjson == null) {
    //             try {
    //                 instance = new Database(username);
    //             } catch (JSONException e) {
    //                 e.printStackTrace();
    //             }
    //         } else {
    //             Gson gson = new GsonBuilder().create();
    //             instance = gson.fromJson(rawjson, Database.class);
    //         }
    //     }
    //     return instance;
    // }

    // /**
    //  * Get the instance of the database If the database is not initialized, it
    //  * will be initialized with the default username
    //  *
    //  * @return The database
    //  */
    // public static Database getInstance() {
    //     if (instance == null) {
    //         String rawjson = null;
    //         if (System.getProperty("os.name").contains("Windows")) {
    //             System.out.println("Windows OS detected.");
    //             String path = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\MyStudyPlan\\default.json";
    //             try {
    //                 rawjson = Files.readString(Path.of(path));
    //             } catch (Exception e) {
    //                 try {
    //                     System.out.println("default.json not found, creating one...");
    //                     File file = new File(path);
    //                     file.getParentFile().mkdirs();
    //                     file.createNewFile();
    //                     System.out.println("Successfully created default.json at " + '"' + path + '"');
    //                 } catch (Exception ex) {
    //                     System.err.println("Error creating default.json at " + '"' + path + '"' + ". " + ex);
    //                 }
    //             }
    //         } else {
    //             System.out.println("Linux OS detected.");
    //             String path = "~/Documents/MyStudyPlan/default.json";
    //             try {
    //                 rawjson = Files.readString(Path.of(path));
    //             } catch (Exception e) {
    //                 try {
    //                     System.out.println("default.json not found, creating one...");
    //                     File file = new File(path);
    //                     file.getParentFile().mkdirs();
    //                     file.createNewFile();
    //                     System.out.println("Created default.json at " + '"' + path + '"');
    //                 } catch (Exception ex) {
    //                     System.err.println("Error creating default.json at " + '"' + path + '"' + ". " + ex);
    //                 }
    //             }
    //         }
    //         if (rawjson == null) {
    //             try {
    //                 instance = new Database("default");
    //             } catch (JSONException e) {
    //                 e.printStackTrace();
    //             }
    //         } else {
    //             Gson gson = new GsonBuilder().create();
    //             instance = gson.fromJson(rawjson, Database.class);
    //         }
    //     }
    //     return instance;
    // }

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
