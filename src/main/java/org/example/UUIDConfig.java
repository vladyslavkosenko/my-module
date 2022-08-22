package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UUIDConfig {
    @Bean
    public UUIDService uuidService(){
        return new UUIDService();
    }
}
