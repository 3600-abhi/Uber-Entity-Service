package com.uber.entityService.entityService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // Added so that createdAt & updatedAt filled automatically
public class EntityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntityServiceApplication.class, args);
    }

}
