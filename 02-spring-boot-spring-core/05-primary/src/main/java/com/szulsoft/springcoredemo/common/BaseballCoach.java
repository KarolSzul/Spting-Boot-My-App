package com.szulsoft.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Do a hundred squats!";
    }
}
