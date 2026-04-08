package com.luv2code.java_design_pattern.creational.Singleton.billpugh;

public class DemoLogger {
    // private constructor to prevent instantiation from outside the class
    private DemoLogger(){
        System.out.println("DemoLogger is initialized.");
    }

    // Static inner class holds the single instance
    // This inner class is not loaded until getInstance() is called, ensuring lazy initialization
    // This provides lazy initialization and is threadsafe without synchronized
    private static class SingletonHelper{
        private static final DemoLogger INSTANCE = new DemoLogger();
    }

    //public method to return the single instance of Logger
    public static DemoLogger getInstance(){
        return SingletonHelper.INSTANCE;
    }

    // simple log method to display message
    public void log(String message){
        System.out.println("LOG: " + message);
    }

}
