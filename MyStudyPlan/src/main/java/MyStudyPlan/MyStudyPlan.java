package MyStudyPlan;

import java.util.logging.Logger;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class MyStudyPlan {

    public static void main(String[] args) {
        parseDatabase();
        // verify credential
        FirebaseRTDB firebase = FirebaseRTDB.initFirebase();
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog"); // disable org.apache.http.impl.conn.Wire DEBUG logging
        boolean isSuccess = false;
        try {
            isSuccess = firebase.isCredentialValid();
        } catch (Exception e) {
        }
        if (!isSuccess) {
            // show login screen
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.WARNING,
                    "Credential is invalid!");
            showLoginPage();
        } else {
            parseDatabase();
            showMainPage();
        }
    }

    public static void parseDatabase() {
        // init database
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Initializing database...");
        Database db = Database.initDatabase();
        if (db == null) {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to initialize database! Exiting...");
            return;
        } else {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO,
                    "Database initialized successfully.");
        }
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Setting up theme...");
        // Set the theme
        try {
            FlatNordIJTheme.setup();
        } catch (Exception e) {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to set theme! Exiting...", e);
            return;
        }
    }

    public static void showMainPage() {
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Going to main app...");
        Overview overview = new Overview();
        overview.setVisible(true);
        overview.setLocationRelativeTo(null);
    }

    public static void showLoginPage() {
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Going to login screen...");
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
