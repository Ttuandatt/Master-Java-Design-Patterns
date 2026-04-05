package com.luv2code.java_design_pattern.creational.Factory;

public class MainApp {
    public static void main(String[] args){
        Notification emailNotification = NotificationFactory.createNotification("email");
        emailNotification.notifyUser();

        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.notifyUser();

        Notification whatsappNotification = NotificationFactory.createNotification("whatsapp");
        whatsappNotification.notifyUser();

    }
}
