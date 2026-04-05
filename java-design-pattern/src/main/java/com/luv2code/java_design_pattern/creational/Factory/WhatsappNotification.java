package com.luv2code.java_design_pattern.creational.Factory;

public class WhatsappNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending WhatsApp notification to user...");
    }
}
