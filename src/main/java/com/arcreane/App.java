package com.arcreane;

import com.arcreane.controller.MovieController;
import com.arcreane.repository.FileRepository;
import com.arcreane.repository.MemoryRepository;
import com.arcreane.repository.MovieRepositoryInterface;
import com.arcreane.service.MovieService;
import com.arcreane.service.MovieServiceInterface;


import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MovieController movieController = null;
        MovieServiceInterface service = null;
        MovieRepositoryInterface repository = null;

        System.out.println("Which Controller do you want to use");
        System.out.println(" - Controller");
        String choice = scanner.nextLine();
        switch (choice.toLowerCase()) {
            case "controller" -> {
                movieController = new MovieController();
            }
        }

        System.out.println("Which Service do you want to use");
        System.out.println(" - Service");
        choice = scanner.nextLine();
        switch (choice.toLowerCase()) {
            case "service" -> {
                service = new MovieService();
            }
        }

        System.out.println("Which repository do you want to use");
        System.out.println(" - Memory \n - File");
        choice = scanner.nextLine();
        switch (choice.toLowerCase()) {
            case "controller" -> {
                repository = new MemoryRepository();
            }
            case "file" -> {
                repository = new FileRepository();
            }
        }

        service.setMovieRepositoryInterface(repository);
        movieController.setMovieServiceInterface(service);
        movieController.addUsingConsole();
    }
}
