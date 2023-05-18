package db;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public class DbConnector {
    private static Connection dbconnect;
  /*  private static String path = "D:\\S_ssd\\GeekBrains" +
            "\\Progects\\Autoservis\\src\\db\\database.properties";*/
    private static String path = "D:\\S_ssd\\GeekBrains\\Progects\\Autoservis" +
          "\\database.properties";

    public static Connection getDBConnection() throws IOException, SQLException, ClassNotFoundException {

        Properties props = new Properties();
        try(InputStream in = Files.newInputStream(Paths.get(path))){
            props.load(in);
        }
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbconnect = DriverManager.getConnection(url, username, password);

        return dbconnect;
    }
}
