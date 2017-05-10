package mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

import java.util.Arrays;

/**
 * Created by mathias on 5/9/17.
 */
public class MongoDBConnector {

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    private static String dbName = "admin";
    private static String username = "administrator";
    private static String password = "firebug";

    private static String host = "188.226.136.226";
    private static int port = 27017;

    private MongoDBConnector() {
        mongoClient = initializeClient();
    }

    public static synchronized MongoDatabase getDBConnection() {
        if (database == null) {
            database = initializeClient().getDatabase(dbName);
        }
        return database;
    }

    private static MongoClient initializeClient() {
        MongoCredential credential = MongoCredential.createCredential(username, dbName, password.toCharArray());
        return new MongoClient(new ServerAddress(host,port), Arrays.asList(credential));
    }
}
