package tests;

import model.Movie;
import dao.MovieDao;

public class TestMovies {
    public static void main(String[] args) {
        Movie movie = new Movie();
        System.out.println(MovieDao.consult());
    }
}
