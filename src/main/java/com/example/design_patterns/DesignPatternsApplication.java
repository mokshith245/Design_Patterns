package com.example.design_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DesignPatternsApplication.class, args);

        Os_Builder phone=new Os_Builder();
        Os obj=phone.getInstance("cheap");

        obj.spec();
        obj=phone.getInstance("costly");
        obj.spec();
        obj=phone.getInstance("windows");
        obj.spec();








    }

}
