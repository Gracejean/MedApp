package medapp;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MedApp", "root", "");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
            return con;

    }
}
