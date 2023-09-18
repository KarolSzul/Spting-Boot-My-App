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

    @GetMapping("/4")
    public String sayHelloWorld4() {
     return "Hello World! MOCARNO! w OPÓR!!!";
    }

    @GetMapping("/5")
    public String sayHelloWorld5() {
     return "Taraz tez zadziala?";
    }

    @GetMapping("/6")
    public String sayHelloWorld6() {
     return "Za pierwszym?";
    }

    @GetMapping("/fortune")
    public String getDailyFOrtune() {
        return "TOday will be a good day!";
    }



}
