package com.synerzip.mailsender.app;

import com.synerzip.mailsender.service.MailSend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-mail.xml");

        MailSend mm = (MailSend) context.getBean("mailSend");
        mm.sendMail("vivek.tiwari.cse16@gmail.com",
                "vivek.tiwari.cse16@gmail.com",
                "Testing Smtp mail service",
                "Testing mail service \n\n Hello Spring Email Sender");

    }
}