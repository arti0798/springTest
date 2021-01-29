package com.example.demo.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

// the class which we want to instantiate at run time can be define with annotation @component
// @Component("dummyBean")
// @Primary


public class emailServiceImp implements emailService{


    private static Log log = LogFactory.getLog(emailServiceImp.class);

    private JavaMailSender javaMailSender; 

    public emailServiceImp(JavaMailSender javaMailSender){

        this.javaMailSender = javaMailSender;
    }
    @Override
    public void sendEmail(String emailId, String subject, String mailContent) throws MessagingException {
        log.info("EmailId : "+emailId);
        log.info("Subject : "+subject);
        log.info("Body : "+mailContent);
        log.warn("This is dummy");


        // MimeMessage message = javaMailSender.createMimeMessage();
		// 	MimeMessageHelper helper;

		// 	helper = new MimeMessageHelper(message, true); // true indicates
	 	// 				  				                   // multipart message
		// 	helper.setSubject("This is test message");
		// 	helper.setTo("dixitshantanu106@gmail.com");
		// 	helper.setText("<h1> Body </h1>", true); // true indicates html

			// continue using helper for more functionalities
            // like adding attachments, etc.  
            
        // private JavaMailSender javaMailSender;

       
            
        
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;
        
        helper = new MimeMessageHelper(message,true);

        helper.setSubject("surprise");
        helper.setTo("sarti0798@gmail.com");
        helper.setText("<h1> hi girl...... </h1>", true);

        javaMailSender.send(message);

    }
    
}
