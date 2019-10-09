package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute")
public class DataConfig {

    @Bean(name = "actor1")
    public Actor actobj(){
        Actor actobj = new Actor();
        actobj.setName("leonardo");
        actobj.setAge(50);
        actobj.setGender("male");
        System.out.println("inside actor bean");
        return actobj;
    }

    @Bean
    public Actor act2(){
        Actor actobj = new Actor();
        actobj.setName("bale");
        actobj.setAge(30);
        actobj.setGender("male");
        System.out.println("inside actor2 bean");
        return actobj;
    }

    @Bean
    public Actor act3(){
        Actor actobj = new Actor();
        actobj.setName("phoenix");
        actobj.setAge(45);
        actobj.setGender("male");
        System.out.println("inside actor2 bean");
        return actobj;
    }


}