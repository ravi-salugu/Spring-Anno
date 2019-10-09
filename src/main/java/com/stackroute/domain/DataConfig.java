package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {

    @Bean
    public Actor actobj(){
        Actor actobj = new Actor();
        actobj.setName("leonardo");
        actobj.setAge(50);
        actobj.setGender("male");
        System.out.println("inside actor bean");
        return actobj;
    }

    @Bean
    public Movie moviebean(){
        Movie movieBean = new Movie(actobj());
        System.out.println("inside movie bean");
        return movieBean;
    }



}