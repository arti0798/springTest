package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exampController {
    

    @Value("${app.smtp.name}")
    private String smtpName;
    //Expose API => http protocol


    @RequestMapping(value = "/hello")
    public String hello() {

        return "Hello jjjjjj : #$#$ : " + smtpName;
    }
}
