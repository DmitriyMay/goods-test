package main;

import main.config.DaoConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[] {Application.class, DaoConfig.class}, args);
    }
}
