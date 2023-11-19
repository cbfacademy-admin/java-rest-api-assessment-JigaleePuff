package com.cbfacademy.apiassessment.Crop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CropConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            CropRepository repository){
        return args -> {
            Crop orange = new Crop(
                    "Orange",
                    3.2d,
                    1.99d
            );

            Crop apple = new Crop(
                    "Apple",
                    1.3d,
                    1.49d
            );

            repository.saveAll(
                    List.of(orange, apple)
            );
        };
    }
}