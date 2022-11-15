package MyStudyPlan;

import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.thegreshams.firebase4j.error.FirebaseException;
import net.thegreshams.firebase4j.error.JacksonUtilityException;
import net.thegreshams.firebase4j.model.FirebaseResponse;
import net.thegreshams.firebase4j.service.Firebase;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class FirebaseRTDB {

    private static Firebase instance = null;

    public static FirebaseRTDB initFirebase() {
        final String firebase_baseUrl = "https://mystudyplan-e29f0-default-rtdb.asia-southeast1.firebasedatabase.app/";

        try {
            instance = new Firebase(firebase_baseUrl);
        } catch (FirebaseException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to connect to Firebase!", e);
        }

        return new FirebaseRTDB();
    }

    public static boolean pullDatabase(String username) {
        try {
            FirebaseResponse response = instance.get(username);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(response.getBody());
            Database.writeDatabase(json);
            return true;
        } catch (FirebaseException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to pull database from Firebase", e);
            return false;
        } catch (UnsupportedEncodingException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to pull database from Firebase", e);
            return false;
        }
    }

    public static boolean pushDatabase() {
        try {
            Map<String, Object> dataMap = Database.readDatabase();
            @SuppressWarnings("unused")
            FirebaseResponse response = instance.put(dataMap.get("username").toString(), dataMap);
            return true;
        } catch (FirebaseException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to push database to Firebase", e);
            return false;
        } catch (IOException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to push database to Firebase", e);
            return false;
        } catch (JacksonUtilityException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to push database to Firebase", e);
            return false;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to push database to Firebase", e);
            return false;
        }
    }

    public static boolean isCredentialValid(String username, String password) {
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Checking credential...");
        try {
            FirebaseResponse usernameDB = instance.get(username);
            if (usernameDB == null) {
                return false;
            }
            String passwordDB = usernameDB.getBody().get("password").toString();
            if (passwordDB == null) {
                return false;
            }
            if (!passwordDB.equals(password.hashCode())) {
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.WARNING, "Invalid credential!");
                return false;
            }
        } catch (FirebaseException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to check credential from Firebase", e);
            return false;
        } catch (UnsupportedEncodingException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to check credential from Firebase", e);
            return false;
        } catch (NullPointerException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.WARNING, "Invalid credential!", e);
            return false;
        }
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Credential is valid.");
        return true;
    }

    public boolean isCredentialValid() {
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Checking credential...");
        try {
            FirebaseResponse usernameDB = instance.get(Database.readDatabase().get("username").toString());
            String passwordDB = usernameDB.getBody().get("password").toString();
            if (!passwordDB.equals(Database.readDatabase().get("password").toString().hashCode())) {
                Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.WARNING, "Invalid credential!");
                return false;
            }
        } catch (FirebaseException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to check credential from Firebase", e);
            return false;
        } catch (UnsupportedEncodingException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to check credential from Firebase", e);
            return false;
        } catch (NullPointerException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.WARNING, "Invalid credential!", e);
            return false;
        }

        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Credential is valid.");
        return true;
    }

    public static boolean isUserExist(String username) {
        try {
            FirebaseResponse usernameDB = instance.get(username);
            if (usernameDB.getBody().isEmpty()) {
                return false;
            }
        } catch (FirebaseException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to check credential from Firebase", e);
            return false;
        } catch (UnsupportedEncodingException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to check credential from Firebase", e);
            return false;
        }
        Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.WARNING, "User already exists!");
        return true;
    }

    public static boolean createNewUser(String username, String password) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            @SuppressWarnings("unchecked")
            Map<String, Object> dataMap = gson.fromJson(new FileReader(Database.path), LinkedHashMap.class);
            dataMap.put("username", username);
            dataMap.put("password", password.hashCode());
            @SuppressWarnings("unused")
            FirebaseResponse response = instance.put(username, dataMap);
            System.out.println(response);
            return true;
        } catch (FirebaseException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to create new user in Firebase", e);
            return false;
        } catch (IOException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to create new user in Firebase", e);
            return false;
        } catch (JacksonUtilityException e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to create new user in Firebase", e);
            return false;
        } catch (Exception e) {
            Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE,
                    "Failed to create new user in Firebase", e);
            return false;
        }
    }
}
