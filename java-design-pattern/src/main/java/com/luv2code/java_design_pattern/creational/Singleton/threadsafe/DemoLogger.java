package com.luv2code.java_design_pattern.creational.Singleton.threadsafe;

public class DemoLogger {
    // static variable to hold the single instance of Logger
    private static DemoLogger instance;

    // private constructor to prevent instantiation from outside the class
    private DemoLogger(){
        System.out.println("DemoLogger is initialized.");
    }

    //public method to return the single instance of Logger
    public static synchronized DemoLogger getInstance(){
        if(instance == null){
            instance = new DemoLogger();
        }
        return instance;
    }

    // simple log method to display message
    public void log(String message){
        System.out.println("LOG: " + message);
    }

}
