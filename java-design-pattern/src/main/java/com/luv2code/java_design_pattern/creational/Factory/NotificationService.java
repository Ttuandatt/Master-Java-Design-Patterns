package com.luv2code.java_design_pattern.creational.Factory;

public class NotificationService {
    // initial implementation

    public void sendNotification(String type){
        if(type.equalsIgnoreCase("email")){
            // Email Notification
            EmailNotification email = new EmailNotification();
            email.send();
        }else if(type.equalsIgnoreCase("sms")) {
            // Sms Notification
            SmsNotification sms = new SmsNotification();
            sms.send();
        }else  if(type.equalsIgnoreCase("whatsapp")) {
            // Whatsapp Notification
            WhatsappNotification whatsapp = new WhatsappNotification();
            whatsapp.send();
        }else{
            System.out.println("Unknown notification type...");
        }
    }
}
