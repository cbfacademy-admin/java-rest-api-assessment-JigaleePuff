package com.cbfacademy.apiassessment.Crop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

@Configuration
public class CropConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            CropRepository repository){
        return args -> {
            Crop orange = new Crop(
                    "Orange",
                    3.2,
                    1.99
            );

            Crop apple = new Crop(
                    "Apple",
                    1.3,
                    1.49
            );
            Crop tomato = new Crop(
                    "tomato",
                    1.3,
                    1.49
            );

            repository.saveAll(
                    List.of(orange, apple, tomato)
            );
        };
    }
}