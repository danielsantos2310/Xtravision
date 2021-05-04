package dao;

import database.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Movie;

public class MovieDao {
    
    public static ArrayList<Movie> consult(){
        ArrayList<Movie> movies = new ArrayList<Movie>();
        try{
            Connection conn = ConnectionDB.getConnection();
            String sql = "SELECT * FROM movies";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Movie m = new Movie();
                m.setId(rs.getInt("id_movie"));
                m.setName(rs.getString("name"));
                m.setPrice(rs.getFloat("price"));
                movies.add(m);
            }
            stmt.close();
            rs.close();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return movies;
    }
}
