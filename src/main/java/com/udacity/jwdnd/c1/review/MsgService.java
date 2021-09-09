package com.udacity.jwdnd.c1.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MsgService {

    public MsgService(){
        System.out.println("messageService created");
    }

    @Autowired
    @Bean
    public String uppercase(String message) {
        System.out.println("uppercase fun bean created");
        return message.toUpperCase(Locale.ROOT);
    }

    @Bean
    public String lowercase(String message) {

        System.out.println("lowercase fun bean created");
        return message.toLowerCase(Locale.ROOT);
    }

}
