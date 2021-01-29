package com.example.demo.controller;

import javax.mail.MessagingException;

import com.example.demo.service.emailService;
import com.example.demo.service.emailServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailServiceController {
    
    // emailService emailservice = new emailServiceImp();

    // @Autowired
    emailService emailservice;
    @RequestMapping("/sendEmail")
    public String email() throws MessagingException {

        emailservice.sendEmail("arti999@gmail.com", "testing", "I m sending email");
        return "Email sent!!!";
    }

    public emailService getEmailservice() {
        return emailservice;
    }

    // @Autowired
    // public void setEmailservice(emailService emailServiceImp) {
    //     this.emailservice = emailservice;
    // }

    // Autowired using contructor
    // @Autowired
    // public void emailServiceController(emailService abc) {
    //         this.emailservice = abc;
    //     }

        @Autowired  //The @Autowired annotation is a great way of making the need to inject a dependency in Spring explicit. 
        public emailServiceController(emailService abc) {
            this.emailservice = abc;
        }

  
}
