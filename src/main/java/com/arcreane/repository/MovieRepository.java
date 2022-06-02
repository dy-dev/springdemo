package com.arcreane.repository;

import com.arcreane.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements MovieRepositoryInterface {
    static List<Movie> s_Movies = new ArrayList<>();

    public void add(Movie p_Movie){
        s_Movies.add(p_Movie);
        System.out.println("The movie " + p_Movie.getTitle() + " has been added.");
    }

}
