package com.arcreane;

import com.arcreane.controller.MovieController;
import com.arcreane.repository.FileRepository;
import com.arcreane.repository.MemoryRepository;
import com.arcreane.repository.MovieRepositoryInterface;
import com.arcreane.service.MovieService;
import com.arcreane.service.MovieServiceInterface;


import java.lang.reflect.InvocationTargetException;
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

        try {
            System.out.println("Which Controller do you want to use");
            String choice = scanner.nextLine();
            movieController = (MovieController) Class.forName(choice).getDeclaredConstructor().newInstance();

            System.out.println("Which Service do you want to use");
            choice = scanner.nextLine();
            service = (MovieServiceInterface) Class.forName(choice).getDeclaredConstructor().newInstance();

            System.out.println("Which repository do you want to use");
            choice = scanner.nextLine();
            repository = (MovieRepositoryInterface) Class.forName(choice).getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        service.setMovieRepositoryInterface(repository);
        movieController.setMovieServiceInterface(service);
        movieController.addUsingConsole();
    }
}
