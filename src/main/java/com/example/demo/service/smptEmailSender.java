package com.example.demo.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
// import org.springframework.mail.javamail.JavaMailSender;
// import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import javax.mail.internet.MimeMessage;

// @Component("smtp")
// @Qualifier("smtp")
public class smptEmailSender implements emailService {

    private static Log log = LogFactory.getLog(emailServiceImp.class);
    private JavaMailSender javaMailSender;

    public smptEmailSender(JavaMailSender javaMailSender) {

        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(String emailId, String subject, String mailContent) throws MessagingException{
        log.info("STPM EmailId : "+emailId);
        log.info("SMTP Subject : "+subject);
        log.info("SMTP Body : "+mailContent);
        log.warn("This is SMTP ");

        // @Autowired
        // private JavaMailSender javaMailSender;

        // MineMessageHelper
        // MimeMessage message = javaMailSender.createMimeMessage();
		// MimeMessageHelper helper;
            
		// helper = new MimeMessageHelper(message, true); // true indicates
	 	// 				  				                   // multipart message
		// helper.setSubject("This is test message");
		// helper.setTo("sarti0798@gmail.com");
		// helper.setText("<h1> Body </h1>", true); // true indicates html

		// 	// continue using helper for more functionalities
        //     // like adding attachments, etc.  
        // javaMailSender.send(message);


        
        
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;

        helper = new MimeMessageHelper(message, true);

        helper.setSubject("surprise");
        helper.setTo("sarti0798@gmail.com");
        helper.setText("<h1> sending email...... </h1>", true);

        javaMailSender.send(message);
    }
    
}
