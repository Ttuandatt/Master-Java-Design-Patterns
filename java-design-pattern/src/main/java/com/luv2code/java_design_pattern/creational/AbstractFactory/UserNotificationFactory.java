package com.luv2code.java_design_pattern.creational.AbstractFactory;

public class UserNotificationFactory implements NotificationFactory{
    @Override
    public EmailNotification createEmailNotification() {
        return new UserEmailNotification();
    }

    @Override
    public SmsNotification createSmsNotification() {
        return new UserSmsNotification();
    }
}
