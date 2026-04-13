package com.company.demomaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myFirstApi {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Dhiraj, Springboot is running";
    }
}
