package me.farfaraway.myeboekfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyeboekfinderApplication {

    @GetMapping("/ping")
    public String ping(){
        return "I am ok";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyeboekfinderApplication.class, args);
    }
}
