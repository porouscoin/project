package database;

import java.lang.reflect.Field;
import java.sql.*;

public class MySQLDBHandler extends DBHandler {

    private static final String DB_URL = "jdbc:mysql://localhost:3307/guideandseekdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345678";

    // Constructor initializes the connection
    public MySQLDBHandler() {
        this.connection = createConnection();
    }

    @Override
    protected Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int save(Object entity) {
        try {
            String query = generateInsertQuery(entity);
            System.out.println(query);
            PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);  // Allow fetching generated keys
            setPreparedStatementParameters(pstmt, entity);
            int rowsAffected = pstmt.executeUpdate();

            // Fetch auto-generated userID (or other auto-generated keys)
            ResultSet generatedKeys = pstmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                int generatedID = generatedKeys.getInt(1);  // Assuming userID is the auto-incremented field
                System.out.println("Generated ID: " + generatedID);
            }
            return rowsAffected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Object entity) {
        try {
            String query = generateUpdateQuery(entity);
            PreparedStatement pstmt = connection.prepareStatement(query);
            setPreparedStatementParameters(pstmt, entity);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(Object entity) {
        try {
            String query = generateDeleteQuery(entity);
            PreparedStatement pstmt = connection.prepareStatement(query);
            setPreparedStatementParameters(pstmt, entity);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ResultSet fetch(String table, String column, String value) {
        try {
            String query = generateSelectQuery(table, column, value);
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, value);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Helper method to generate insert query dynamically
    private String generateInsertQuery(Object entity) {
        StringBuilder query = new StringBuilder("INSERT INTO " + entity.getClass().getSimpleName().toLowerCase() + " (");
        StringBuilder values = new StringBuilder("VALUES (");
        Field[] fields = entity.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            // Exclude userID (assuming it's the first field and auto-incremented)
            if ("userID".equals(fields[i].getName())) {
                continue;
            }
            query.append(fields[i].getName());
            values.append("?");
            if (i < fields.length - 1 && !"userID".equals(fields[i].getName())) {
                query.append(", ");
                values.append(", ");
            }
        }
        query.append(") ").append(values).append(")");
        return query.toString();
    }

    // Helper method to generate update query dynamically
    private String generateUpdateQuery(Object entity) {
        StringBuilder query = new StringBuilder("UPDATE " + entity.getClass().getSimpleName().toLowerCase() + " SET ");
        Field[] fields = entity.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            // Exclude userID from the update query (we don't want to update the auto-increment field)
            if ("userID".equals(fields[i].getName())) {
                continue;
            }
            query.append(fields[i].getName()).append(" = ?");
            if (i < fields.length - 1 && !"userID".equals(fields[i].getName())) {
                query.append(", ");
            }
        }
        query.append(" WHERE userID = ?");
        return query.toString();
    }

    // Helper method to generate delete query dynamically
    private String generateDeleteQuery(Object entity) {
        return "DELETE FROM " + entity.getClass().getSimpleName().toLowerCase() + " WHERE userID = ?";
    }

    // Helper method to generate select query dynamically
    private String generateSelectQuery(String table, String column, String value) {
        return "SELECT * FROM " + table + " WHERE " + column + " = ?";
    }

    // Helper method to set parameters for prepared statement
    private void setPreparedStatementParameters(PreparedStatement pstmt, Object entity) throws SQLException {
        Field[] fields = entity.getClass().getDeclaredFields();
        int paramIndex = 1;  // Starting from the first parameter
        for (int i = 0; i < fields.length; i++) {
            // Exclude userID from being set (auto-increment field)
            if ("userID".equals(fields[i].getName())) {
                continue;
            }
            try {
                fields[i].setAccessible(true);
                pstmt.setObject(paramIndex++, fields[i].get(entity));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}