//can all of you add this? JSON rulez
//https://search.maven.org/remotecontent?filepath=org/json/json/20220924/json-20220924.jar

package MyStudyPlan;

import org.json

public class Database {
    private static Database instance = null;
    private Database (String username){

    }
    public static Database getInstance(String username){
        if(instance == null){
            instance = new Database(username);
        }
        return instance;
    }
}
