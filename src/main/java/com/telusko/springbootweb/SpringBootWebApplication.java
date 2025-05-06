package com.telusko.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootWebApplication 
{

    public static void main(String[] args) 
    {
        ApplicationContext context = SpringApplication.run(SpringBootWebApplication.class, args);
        context.getBean(HomeController.class);
    }
}
