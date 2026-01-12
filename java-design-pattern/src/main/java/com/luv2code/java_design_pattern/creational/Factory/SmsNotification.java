package com.luv2code.java_design_pattern.creational.Factory;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending sms....");
    }
}
