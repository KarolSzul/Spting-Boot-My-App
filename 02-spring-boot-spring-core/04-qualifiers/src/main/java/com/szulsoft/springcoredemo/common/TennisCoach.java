package com.szulsoft.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Do a thousand situps!";
    }
}
