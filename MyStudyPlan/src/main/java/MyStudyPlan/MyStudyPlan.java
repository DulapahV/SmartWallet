package MyStudyPlan;

import java.util.logging.Logger;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 *         Annopdanai Pamarapa (64011337)
 */
public class MyStudyPlan {

    public static void main(String[] args) {
        // init database
        Database db = Database.initDatabase();
        if (db == null) {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to initialize database! Exiting...");
            return;
        } else {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Database initialized successfully.");
        }
    }
}
