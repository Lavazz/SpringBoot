package com.epam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CommandLineRunnerBean implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Hello World");
    }
}