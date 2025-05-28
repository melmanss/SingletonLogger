package org.example;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("first message");
        logger2.log("second message");

        System.out.println(logger1 == logger2);

        System.out.println(logger1.getLogs());
    }
}
