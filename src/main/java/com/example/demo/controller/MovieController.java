package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.model.Actor;
import com.example.demo.controller.ActorController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.model.Movie.mainActor;
import static com.example.demo.model.Movie.filmography;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MovieController {

    private static final Map<String, List<Movie>> movieDB = new HashMap<String, List<Movie>>();

    static {

        List<Movie> movies = new ArrayList<Movie>();
        Movie movie = new Movie("Bullet Train", "David Leitch", mainActor,
                "3 Aout 2022");
        movies.add(movie);

        movieDB.put("MyFilms", movies);
    }

    @RequestMapping(value = "/getAllMovies/{*}", method = RequestMethod.GET)
    public List<Movie> getAllMovies() {
        return movieDB.get("value");
    }
    @RequestMapping(value = "/getMoviesByTitle/{title}", method = RequestMethod.GET)
    public List<Movie> getActorByName(@PathVariable String title) {

        System.out.println("Looking for the movie : " + title);
        List<Movie> movieList = movieDB.get(title);
        if(movieList == null) {
            movieList = new ArrayList<Movie>();
            Movie movie = new Movie("Not found", "N/A", mainActor,
                    "N/A");
            movieList.add(movie);
        }
        return movieList;
    }

    @RequestMapping(value = "/getMoviesByReleaseDate/{date}", method = RequestMethod.GET)
    public List<Movie> getMovieListByReleaseDate(@PathVariable String date) {
        System.out.println("Looking for the movie released in : " + date);

        List<Movie> movieList = movieDB.get(date);
        if(movieList == null) {
            movieList = new ArrayList<Movie>();
            Movie movie = new Movie("Not found", "N/A", mainActor, "N/A");
            movieList.add(movie);
        }
        return movieList;
    }
}
