//can all of you add this? JSON rulez
//https://search.maven.org/remotecontent?filepath=org/json/json/20220924/json-20220924.jar

package MyStudyPlan;

import java.io.File;
import java.util.Vector;

import org.json.*;

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
}
