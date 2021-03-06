package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBEngine {

    public DBEngine() {
        connection = connect();
    }

    public boolean isConnected() {
        return (connection != null);
    }

    private Connection connection;

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/rpgDB_script" +
                "?useUnicode=yes&characterEncoding=UTF-8";

        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASSWORD"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            return null;
        }
    }

}
