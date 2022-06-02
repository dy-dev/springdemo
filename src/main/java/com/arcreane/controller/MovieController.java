package com.arcreane.controller;

import com.arcreane.entity.Movie;
import com.arcreane.service.MovieService;

import java.util.Scanner;

public class MovieController {
    Scanner myScan;
    MovieService movieService;

    public MovieController() {
        myScan = new Scanner(System.in);
        movieService = new MovieService();

    }

    public void addUsingConsole() {
        System.out.println("What is the title name");
        String title = myScan.nextLine();
        System.out.println("What is the movie type");
        String type = myScan.nextLine();

        Movie movie = new Movie(title, type);

        movieService.registerMovie(movie);
    }
}
