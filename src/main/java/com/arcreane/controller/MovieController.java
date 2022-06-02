package com.arcreane.controller;

import com.arcreane.entity.Movie;
import com.arcreane.service.MovieService;
import com.arcreane.service.MovieServiceInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@NoArgsConstructor
public class MovieController {
    Scanner myScan= new Scanner(System.in);
    private
    @Getter
    @Setter
    MovieServiceInterface movieServiceInterface;

    public void addUsingConsole() {
        System.out.println("What is the title name");
        String title = myScan.nextLine();
        System.out.println("What is the movie type");
        String type = myScan.nextLine();

        Movie movie = new Movie(title, type);

        movieServiceInterface.registerMovie(movie);
    }
}
