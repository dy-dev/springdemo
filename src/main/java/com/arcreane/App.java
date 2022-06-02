package com.arcreane;

import com.arcreane.controller.MovieController;
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
        MovieController movieController = new MovieController();
        movieController.addUsingConsole();
    }
}
