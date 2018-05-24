package com.expertzlab.hiveex;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
public class HiveCreateDb {
    //private static String driverName = "org.apache.hadoop.hive.jdbc.HiveDriver";
    private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    //private static String driverString = "org.apache.hive.jdbc.HiveDriver";
    private static String urlString = "jdbc:hive://localhost:10000/default";

    public static void main(String[] args) {
        // Register driver and create driver instance
try {
    Class.forName(driverName);
    // get connection

    Connection con = DriverManager.getConnection(urlString, "APP", "mine");
    //Connection con = DriverManager.getConnection("jdbc:hive://localhost:10000/default");
    Statement stmt = con.createStatement();

    stmt.executeQuery("CREATE DATABASE userdb");
    System.out.println("Database is created successfully");

    con.close();
}
catch(Exception e){
    System.out.println(e);

}
}
}
