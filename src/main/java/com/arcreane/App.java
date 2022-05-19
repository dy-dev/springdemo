package com.arcreane;

import com.arcreane.entity.Movie;
import com.arcreane.service.MovieService;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner myScan = new Scanner(System.in);
        System.out.println("What is the title name");
        String title = myScan.nextLine();
        System.out.println("What is the movie type");
        String type = myScan.nextLine();

        Movie movie = new Movie(title, type);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
