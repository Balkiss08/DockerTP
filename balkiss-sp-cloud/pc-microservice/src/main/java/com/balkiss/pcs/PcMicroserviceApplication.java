package com.balkiss.pcs;

import com.balkiss.pcs.entities.Pc;
import com.balkiss.pcs.repos.PcRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
@EnableFeignClients
@SpringBootApplication
public class PcMicroserviceApplication {

        public static void main(String[] args) {
            SpringApplication.run(PcMicroserviceApplication.class, args);
        }
        @Bean
        CommandLineRunner commandLineRunner(PcRepository pcRepository) {
            return args -> {
                pcRepository.save(Pc.builder()
                        .nomPc("Hp pavillon")
                        .prixPc(2000)
                        .marqCode("HP01")
                        .build());
                pcRepository.save(Pc.builder()
                        .nomPc("ASUS ")
                        .prixPc(2090)
                        .marqCode("ASUS01")
                        .build());
            };
        }
  /*  @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    */
    }
