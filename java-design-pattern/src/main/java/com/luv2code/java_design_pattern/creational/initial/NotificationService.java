package com.luv2code.java_design_pattern.creational.initial;

public class NotificationService {
    // initial implementation
    public void sendNotification(String type){
        // TODO
        if(type==null || type.isEmpty()){
            return;
        }

        if(type.equalsIgnoreCase("SMS")){
            SmsNotification smsNotification = new SmsNotification();
            smsNotification.send();
        } else if(type.equalsIgnoreCase("EMAIL")){
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.send();
        } else if(type.equalsIgnoreCase("WHATSAPP")){
            WhatsappNotification whatsappNotification = new WhatsappNotification();
            whatsappNotification.send();
        } else {
            System.out.println("Invalid notification type: " + type);
        }
    }
}
