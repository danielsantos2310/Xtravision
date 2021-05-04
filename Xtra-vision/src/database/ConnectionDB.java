package database;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author brener
 */
public class ConnectionDB {
    
    private static final String URL = "jdbc:mysql://52.50.23.197:3306/Brener_2019330?useSSL=false";
    private static final String USER = "Brener_2019330";
    private static final String PASSWD = "2019330";
    public static Connection getConnection(){
        try{
            Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
            return conn;
        } catch (Exception e){
            return null;
        }         
    }   
}
    
