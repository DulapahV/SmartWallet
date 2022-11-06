//can all of you add this? JSON rulez
//https://search.maven.org/remotecontent?filepath=org/json/json/20220924/json-20220924.jar

package MyStudyPlan;

import java.io.File;
import java.util.Vector;

import org.json.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Database {
    private static Database instance = null;
    private JSONObject database;
    File fileIO = new File("~/Documents/MyStudyPlan/database.json");
    private Vector<Subject> subjList;
    private Vector<TaskInstance> taskList;
    private Vector<ClassInstance> classList;
    private Vector<ExamInstance> examList;

    private Database (String username){

    }
    public static Database getInstance(String username){
        if(instance == null){
            instance = new Database(username);
        }
        return instance;
    }

    public static Database getInstance(){
        if(instance == null){
            instance = new Database("default");
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
