package com.kumar.singleton;

/**
 * Singleton class with eager initialization.
 * This approach initializes the singleton instance at class loading time.
 */
public class DBConnection {

    // Eagerly initialized singleton instance.
    private static final DBConnection dbConnection = new DBConnection();

    // Private constructor to prevent instantiation.
    private DBConnection() {
    }

    /**
     * Provides the singleton instance of the class.
     *
     * @return the singleton instance.
     */
    public static DBConnection getInstance() {
        return dbConnection;
    }

    public static void main(String[] args) {
        // Retrieve the singleton instance and print it.
        final DBConnection instance = DBConnection.getInstance();
        System.out.println(instance);
    }
}

/**
 * Singleton class with lazy initialization.
 * This approach initializes the singleton instance only when it's first requested.
 */
class DBConnectionLazy {

    // Lazily initialized singleton instance.
    private static DBConnectionLazy dbConnection;

    // Private constructor to prevent instantiation.
    private DBConnectionLazy() {
    }

    /**
     * Provides the singleton instance of the class.
     * This method uses lazy initialization.
     *
     * @return the singleton instance.
     */
    public static DBConnectionLazy getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnectionLazy();
        }
        return dbConnection;
    }

    public static void main(String[] args) {
        // Retrieve the singleton instance and print it.
        final DBConnectionLazy instance = DBConnectionLazy.getInstance();
        System.out.println(instance);
    }
}

/**
 * Singleton class with synchronized method for thread-safe lazy initialization.
 * Synchronizes the getInstance method to ensure only one instance is created in a multithreaded environment.
 */
class DBConnectionSync {

    // Lazily initialized singleton instance.
    private static DBConnectionSync dbConnection;

    // Private constructor to prevent instantiation.
    private DBConnectionSync() {
    }

    /**
     * Provides the singleton instance of the class.
     * This method uses synchronized access for thread safety.
     *
     * @return the singleton instance.
     */
    public static synchronized DBConnectionSync getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnectionSync();
        }
        return dbConnection;
    }

    public static void main(String[] args) {
        // Retrieve the singleton instance and print it.
        final DBConnectionSync instance = DBConnectionSync.getInstance();
        System.out.println(instance);
    }
}

/**
 * Singleton class using double-checked locking.
 * This approach improves performance by reducing the cost of synchronized access.
 */
class DBConnectionSync1 {

    // Volatile keyword ensures visibility of changes to variables across threads.
    private static volatile DBConnectionSync1 dbConnection;

    // Private constructor to prevent instantiation.
    private DBConnectionSync1() {
    }

    /**
     * Provides the singleton instance of the class.
     * This method uses double-checked locking for improved performance.
     *
     * @return the singleton instance.
     */
    public static DBConnectionSync1 getInstance() {
        if (dbConnection == null) {
            synchronized (DBConnectionSync1.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnectionSync1();
                }
            }
        }
        return dbConnection;
    }

    public static void main(String[] args) {
        // Retrieve the singleton instance and print it.
        final DBConnectionSync1 instance = DBConnectionSync1.getInstance();
        System.out.println(instance);
    }
}

/**
 * Singleton class using Bill Pugh's Singleton Design Pattern.
 * This approach leverages the class loader mechanism to ensure thread safety and lazy initialization.
 */
class DBConnectionSol {

    // Private constructor to prevent instantiation.
    private DBConnectionSol() {
    }

    // Inner static helper class responsible for holding the singleton instance.
    private static class DBConnectionHelper {
        // The singleton instance is created and held by this static inner class.
        private static final DBConnectionSol INSTANCE_OBJECT = new DBConnectionSol();
    }

    /**
     * Provides the singleton instance of the class.
     * This method uses Bill Pugh's Singleton Design Pattern for initialization.
     *
     * @return the singleton instance.
     */
    public static DBConnectionSol getInstance() {
        return DBConnectionHelper.INSTANCE_OBJECT;
    }

    public static void main(String[] args) {
        // Retrieve the singleton instance and print it.
        final DBConnectionSol instance = DBConnectionSol.getInstance();
        System.out.println(instance);
    }
}

/**
 * Singleton implementation using an enum.
 * This approach is the most concise and thread-safe way to implement Singleton.
 * all constructor are private and one object of enum is created per jvm, so by default enum are singleton only
 */
enum DBConnectionEnum {
    INSTANCE;

    // Add any methods or properties you need for this singleton instance.
}