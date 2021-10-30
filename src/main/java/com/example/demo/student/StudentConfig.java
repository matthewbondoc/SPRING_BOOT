package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student matthew = new Student(
                    1L,
                    "Matthew",
                    "matthew.bondoc@gmail.com",
                    LocalDate.of(1999, JUNE, 11)
            );
            Student mark = new Student(
                    "Mark",
                    "mark@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 10)
            );

            repository.saveAll(
                    List.of(matthew, mark)
            );
        };
    }
}
