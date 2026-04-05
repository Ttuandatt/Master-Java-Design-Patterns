package com.luv2code.java_design_pattern.creational.AbstractFactory;

public class UserSmsNotification implements SmsNotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification to user...");
    }
}
