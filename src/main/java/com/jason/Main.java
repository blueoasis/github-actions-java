package com.jason;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            printMessage("i = " + i);
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}