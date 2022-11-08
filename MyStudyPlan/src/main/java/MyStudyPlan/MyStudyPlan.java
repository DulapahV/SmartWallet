package MyStudyPlan;

import java.util.logging.Logger;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 *         Annopdanai Pamarapa (64011337)
 */
public class MyStudyPlan {

    public static void main(String[] args) {
        // init database
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Initializing database...");
        Database db = Database.initDatabase();
        if (db == null) {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to initialize database! Exiting...");
            return;
        } else {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Successfully initialized Database.");
        }
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Setting up theme...");
        /* Set the theme */
        try {
            FlatNordIJTheme.setup();
        } catch (Exception e) {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.SEVERE, "Failed to set theme! Exiting...");
            return;
        }
        // If username is null, show login screen
        if (db.getUsername().isEmpty()) {
            // show login screen
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Going to login screen...");
            Login login = new Login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
        } else {
            // show main screen
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Welcome back, " + db.getUsername() +"!\nGoing to main app...");
            Overview overview = new Overview();
            overview.setVisible(true);
            overview.setLocationRelativeTo(null);
        }
    }
}
