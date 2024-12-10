package main.java.others;

import main.java.controllers.PromptDialogController;
import java.sql.*;
public class DBConnection {
    public static Connection getConnection(){
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://bfzc8y8lol4ziy1zmk7o-mysql.services.clever-cloud.com:3306/bfzc8y8lol4ziy1zmk7o";
//            Connection connection = DriverManager.getConnection(url,"ueanip7dtwkiadsx","Qz9xOTH76P2cnA7J9RPD");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/inventory";
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/inventory","root","arka");
            return connection;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
