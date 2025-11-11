package com.balkiss.marquemicroservice;

import com.balkiss.marquemicroservice.entities.Marque;
import com.balkiss.marquemicroservice.repos.MarqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MarqueMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarqueMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(MarqueRepository marqueRepository) {
        return args -> {
            marqueRepository.save(Marque.builder()
                    .nomMarque("ASUS")
                    .marqCode("ASUS01")
                    .build());
            marqueRepository.save(Marque.builder()
                    .nomMarque("HP" )
                    .marqCode("HP01")
                    .build());
        };
    }
}
