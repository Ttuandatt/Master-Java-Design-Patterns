package com.luv2code.java_design_pattern.creational.Factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending Email notification to user...");
    }
}
