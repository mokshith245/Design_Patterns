package com.example.design_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DesignPatternsApplication.class, args);

        Phone p= new phone_builder().setOs("Android").setRam(10).getPhone();

        System.out.println(p);





    }

}
