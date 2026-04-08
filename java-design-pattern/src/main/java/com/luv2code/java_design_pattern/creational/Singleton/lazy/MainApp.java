package com.luv2code.java_design_pattern.creational.Singleton.lazy;

public class MainApp {
    public static void main(String[] args){
        DemoLogger instance1 = DemoLogger.getInstance();
        instance1.log("This is the first log message.");

        DemoLogger instance2 = DemoLogger.getInstance();
        instance2.log("This is the second log message.");

        System.out.println();

        boolean flag = (instance2==instance1);
        System.out.println("Are both instances the same? " + flag);
    }
}
