package com.luv2code.java_design_pattern.creational.AbstractFactory;

public class AdminNotificationFactory implements NotificationFactory{
    @Override
    public EmailNotification createEmailNotification() {
        return new AdminEmailNotification();
    }

    @Override
    public SmsNotification createSmsNotification() {
        return new AdminSmsNotification();
    }
}
