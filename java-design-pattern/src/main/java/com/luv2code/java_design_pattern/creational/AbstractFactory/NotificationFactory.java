package com.luv2code.java_design_pattern.creational.AbstractFactory;

public interface NotificationFactory {
    EmailNotification createEmailNotification();
    SmsNotification createSmsNotification();
}
