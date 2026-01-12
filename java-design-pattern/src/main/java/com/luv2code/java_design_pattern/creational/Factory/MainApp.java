package com.luv2code.java_design_pattern.creational.Factory;

public class MainApp {
    public static void main(String[] args){
        Notification emailNotification = NofiticationFactory.createNotification("email");
        emailNotification.notifyUser();

        Notification smslNotification = NofiticationFactory.createNotification("sms");
        smslNotification.notifyUser();

        Notification whatsappNotification = NofiticationFactory.createNotification("whatsapp");
        whatsappNotification.notifyUser();

        Notification messengerNotification = NofiticationFactory.createNotification("messenger");
        messengerNotification.notifyUser();
    }
}
