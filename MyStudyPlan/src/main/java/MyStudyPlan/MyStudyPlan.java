package MyStudyPlan;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class MyStudyPlan {

    public static void main(String[] args) {
        // init database
       Database db = Database.initDatabase();
       if (db == null) {
           System.out.println("Database is either empty or contains error! Going to login page...");
           return;
       }
    }
}
