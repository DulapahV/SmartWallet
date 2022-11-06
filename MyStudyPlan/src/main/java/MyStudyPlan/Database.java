//can all of you add this? JSON rulez
//https://search.maven.org/remotecontent?filepath=org/json/json/20220924/json-20220924.jar

package MyStudyPlan;

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

    private Database (String username) throws JSONException {
        this.username = username;
    }
    public static Database getInstance(String username){
        if(instance == null){
            String rawjson = null;
            if (System.getProperty("os.name").contains("Windows")) {
                try{
                    rawjson = Files.readString(Path.of("%userprofile%\\Documents\\MyStudyPlan\\" + username + ".json"));
                } catch (Exception e) {
                    //TODO: dialogue box to create new file
                }
            } else {
                try{
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

    public static Database getInstance(){
        if(instance == null){
            String rawjson = null;
            if (System.getProperty("os.name").contains("Windows")) {
                try{
                    rawjson = Files.readString(Path.of("%userprofile%\\Documents\\MyStudyPlan\\default.json"));
                } catch (Exception e) {
                    //TODO: dialogue box to create new file
                }
            } else {
                try{
                    rawjson = Files.readString(Path.of("~/Documents/MyStudyPlan/default.json"));
                } catch (Exception e) {
                    //TODO: dialogue box to create new file
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

    public static void addSubject(Subject subject){
        instance.subjList.add(subject);
    }

    public static void addTask(TaskInstance task){
        instance.taskList.add(task);
    }

    public static void addClass(ClassInstance classInstance){
        instance.classList.add(classInstance);
    }

    public static void addExam(ExamInstance exam){
        instance.examList.add(exam);
    }

    public static void removeSubject(Subject subject){
        instance.subjList.remove(subject);
    }

    public static void removeTask(TaskInstance task){
        instance.taskList.remove(task);
    }

    public static void removeClass(ClassInstance classInstance){
        instance.classList.remove(classInstance);
    }

    public static void removeExam(ExamInstance exam){
        instance.examList.remove(exam);
    }

    public static Vector<Subject> getSubjList(){
        return instance.subjList;
    }

    public static Vector<TaskInstance> getTaskList(){
        return instance.taskList;
    }

    public static Vector<ClassInstance> getClassList(){
        return instance.classList;
    }

    public static Vector<ExamInstance> getExamList(){
        return instance.examList;
    }

}
