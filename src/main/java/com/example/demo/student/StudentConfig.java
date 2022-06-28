/* 
package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maria = new Student(
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));
            Student jose = new Student(
                    "Jose",
                    "Jose@gmail.com",
                    LocalDate.of(2001, Month.AUGUST, 21));

            repository.saveAll(
                    List.of(maria, jose));

        };
    }

} */
