package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubCicdActionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubCicdActionsApplication.class, args);
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to javatechie !";
    }
}
