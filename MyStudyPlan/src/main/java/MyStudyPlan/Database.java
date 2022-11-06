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
     * Get the instance of the database
     * If the database is not created, create a new database with the given username
     * @param username The username of the database
     * 
     * @return The database
     */
    public static Database getInstance(String username) {
        if (instance == null) {
            String rawjson = null;
            if (System.getProperty("os.name").contains("Windows")) {
                try {
                    rawjson = Files.readString(Path.of("%userprofile%\\Documents\\MyStudyPlan\\" + username + ".json"));
                } catch (Exception e) {
                    //TODO: dialogue box to create new file
                }
            } else {
                try {
                    rawjson = Files.readString(Path.of("~/Documents/MyStudyPlan/" + username + ".json"));
                } catch (Exception e) {
                    //TODO: dialogue box to create new file
                }
            }
            if (rawjson == null) {
                try {
                    instance = new Database(username);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Gson gson = new GsonBuilder().create();
                instance = gson.fromJson(rawjson, Database.class);
            }
        }
        return instance;
    }

    
    /** 
     * Get the instance of the database
     * If the database is not initialized, it will be initialized with the default username
     * @return The database
     */
    public static Database getInstance() {
        if (instance == null) {
            String rawjson = null;
            if (System.getProperty("os.name").contains("Windows")) {
                try {
                    rawjson = Files.readString(Path.of("%userprofile%\\Documents\\MyStudyPlan\\default.json"));
                } catch (Exception e) {
                    System.err.println("Error reading: " + e);
                }
            } else {
                try {
                    rawjson = Files.readString(Path.of("~/Documents/MyStudyPlan/default.json"));
                } catch (Exception e) {
                    System.err.println("Error reading: " + e);
                }
            }
            if (rawjson == null) {
                try {
                    instance = new Database("default");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Gson gson = new GsonBuilder().create();
                instance = gson.fromJson(rawjson, Database.class);
            }
        }
        return instance;
    }

    
    /** 
     * Add a subject to the database
     * @param subject
     * 
     */
    public static void addSubject(Subject subject) {
        instance.subjList.add(subject);
    }

    
    /** 
     * Add a task to the database
     * @param task
     * 
     */
    public static void addTask(TaskInstance task) {
        instance.taskList.add(task);
    }

    
    /** 
     * Add a class to the database
     * @param classInstance
     * 
     */
    public static void addClass(ClassInstance classInstance) {
        instance.classList.add(classInstance);
    }

    
    /** 
     * Add an exam to the database
     * @param exam
     * 
     */
    public static void addExam(ExamInstance exam) {
        instance.examList.add(exam);
    }

    
    /** 
     * Remove a subject from the database
     * @param subject
     */
    public static void removeSubject(Subject subject) {
        instance.subjList.remove(subject);
    }

    
    /** 
     * Remove a task from the database
     * @param task
     */
    public static void removeTask(TaskInstance task) {
        instance.taskList.remove(task);
    }

    
    /** 
     * Remove a class from the database
     * @param classInstance
     */
    public static void removeClass(ClassInstance classInstance) {
        instance.classList.remove(classInstance);
    }

    
    /** 
     * Remove an exam from the database
     * @param exam
     */
    public static void removeExam(ExamInstance exam) {
        instance.examList.remove(exam);
    }

    
    /** 
     * Get the list of subjects in the database
     * @return Vector<Subject>
     */
    public static Vector<Subject> getSubjList() {
        return instance.subjList;
    }

    
    /** 
     * Get the list of tasks in the database
     * @return Vector<TaskInstance>
     */
    public static Vector<TaskInstance> getTaskList() {
        return instance.taskList;
    }

    
    /** 
     * Get the list of classes in the database
     * @return Vector<ClassInstance>
     */
    public static Vector<ClassInstance> getClassList() {
        return instance.classList;
    }

    
    /** 
     * Get the list of exams in the database
     * @return Vector<ExamInstance>
     */
    public static Vector<ExamInstance> getExamList() {
        return instance.examList;
    }

}
