package com.book.shop;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;;
public class JavaMailUtil {
    public static void sendMail(String receipt) throws Exception{

        System.out.println("Mail Send Preparing.");

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccount = "ireshdilshan46@gmail.com";
        String password = "mabd pixs uvra kszc";

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccount, password);
            }
        });

        Message message = prepareMessage(session,myAccount,receipt);
        Transport.send(message);
        System.out.println("Message Sent Successfully.");
    }

    private static Message prepareMessage(Session session, String myAccount, String receipt) throws Exception {
       
        Random random = new Random();
        int number = random.nextInt(10000000);
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myAccount));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(receipt));
        message.setSubject("My First Email In I Will Create");
        message.setText("Hello Iresh Dilshan.I m CEo in the SO2 company.\nwe will decide you for get our president ship\n"+number);
        return message;
    }
}