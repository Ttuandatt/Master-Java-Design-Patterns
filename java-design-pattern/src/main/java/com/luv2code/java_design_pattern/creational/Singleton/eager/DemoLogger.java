package com.luv2code.java_design_pattern.creational.Singleton.eager;

public class DemoLogger {
    // static variable to hold the single instance of Logger
    //
    // create the single instance when the class is created
    private static final DemoLogger instance = new DemoLogger();

    // private constructor to prevent instantiation from outside the class
    private DemoLogger(){
        System.out.println("DemoLogger is initialized.");
    }

    //public method to return the single instance of Logger
    public static DemoLogger getInstance(){
        return instance;
    }

    // simple log method to display message
    public void log(String message){
        System.out.println("LOG: " + message);
    }

}
