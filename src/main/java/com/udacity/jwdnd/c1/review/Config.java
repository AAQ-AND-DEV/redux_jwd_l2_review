package com.udacity.jwdnd.c1.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Autowired
    MsgService msgService;

    @Bean
    public String message(){

        System.out.println("msg bean created");
        return "Hello Spring!";
    }


    @Bean
    public String uppercaseMessage(String message){

        System.out.println("uppercasemsg bean created");
        return msgService.uppercase(message);

    }


}
