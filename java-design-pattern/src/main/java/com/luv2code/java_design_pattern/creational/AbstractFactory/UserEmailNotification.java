package com.luv2code.java_design_pattern.creational.AbstractFactory;

public class UserEmailNotification implements EmailNotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Email notification to user...");
    }
}
