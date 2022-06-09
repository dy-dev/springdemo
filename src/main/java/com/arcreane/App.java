package com.arcreane;

import com.arcreane.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
@Configuration
@ComponentScan({"com.arcreane.controller","com.arcreane.service","com.arcreane.repository.file" })
//@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MovieController controller = (MovieController)context.getBean(MovieController.class);
        controller.addUsingConsole();
    }
}
