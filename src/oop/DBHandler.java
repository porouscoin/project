package oop;

import java.sql.*;

public abstract class DBHandler {

    protected Connection connection;

    // Abstract method to create connection
    protected abstract Connection createConnection();

    // Abstract method to close connection
    public abstract void closeConnection();

    // Abstract methods for CRUD operations
    public abstract int save(Object entity);
    public abstract int update(Object entity);
    public abstract int delete(Object entity);
    public abstract ResultSet fetch(String table, String column, String value);

    // Get connection
    public Connection getConnection() {
        return connection;
    }
}