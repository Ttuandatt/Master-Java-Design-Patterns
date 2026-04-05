package com.luv2code.java_design_pattern.creational.initial;

public class MainApp {
    public static void main(String[] args){
        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification("SMS");
        notificationService.sendNotification("EMAIL");
        notificationService.sendNotification("WHATSAPP");
    }
}
