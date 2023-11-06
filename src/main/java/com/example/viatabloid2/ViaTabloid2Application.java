package com.example.viatabloid2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ViaTabloid2Application {

    @GetMapping("/")
    public String getMessage(){
        return "Welcome to Javaf";
    }
    public static void main(String[] args) {
        SpringApplication.run(ViaTabloid2Application.class, args);
    }

}
