package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    private Connection connection;

    // open connection
    public Connection getConnection() throws SQLException, IOException {
        if (connection == null || connection.isClosed()) {
        Properties properties = new Properties();
        properties.load(Files.newInputStream(Paths.get("src/main/resources/database.properties")));
        String url = properties.getProperty("url");
        String username = properties.getProperty("user");
        String password = properties.getProperty("pass");
        connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

    //close connection
    public void disConnection() throws SQLException {
        if (connection != null && connection.isClosed()) {
            connection.close();
        }
    }

}
