package com.example.demo.service;

import javax.mail.MessagingException;

public interface emailService {
    
    void sendEmail(String emailId,String subject,String mailContent) throws MessagingException;
}
