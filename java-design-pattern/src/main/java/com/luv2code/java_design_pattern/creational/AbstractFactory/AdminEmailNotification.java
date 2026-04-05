package com.luv2code.java_design_pattern.creational.AbstractFactory;

public class AdminEmailNotification implements EmailNotification{
    @Override
    public void notifyUser(){
        System.out.println("Sending Admin Email notification to user...");
    }
}
