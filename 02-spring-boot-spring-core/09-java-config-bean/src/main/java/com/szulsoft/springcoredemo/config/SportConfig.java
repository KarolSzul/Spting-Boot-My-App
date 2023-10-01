package com.szulsoft.springcoredemo.config;

import com.szulsoft.springcoredemo.common.Coach;
import com.szulsoft.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
