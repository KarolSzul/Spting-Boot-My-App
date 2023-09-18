package com.example.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHelloWorld() {
     return "Hello World! MOCNO!";
    }


    @GetMapping("/2")
    public String sayHelloWorld2() {
     return "Hello World! MOCNO!";
    }

    @GetMapping("/3")
    public String sayHelloWorld3() {
     return "Hello World! MOCARNO!";
    }


}
