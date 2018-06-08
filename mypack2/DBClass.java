package mypack2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by agnel on 6/1/18.
 */
public class DBClass {

    static private Connection  connection;

    public static Connection getConnection() throws Exception{
        if(connection == null){
            //JDBC
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "agnel");
        }
        return connection;
    }
}
