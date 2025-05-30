package com.gestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UsuarioSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsuarioSpringApplication.class, args);
    }
}