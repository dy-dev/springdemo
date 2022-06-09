package com.arcreane;

import com.arcreane.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieController controller = (MovieController)context.getBean(MovieController.class);
        controller.addUsingConsole();
    }
}
