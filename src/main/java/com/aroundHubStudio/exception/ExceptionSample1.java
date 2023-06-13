package com.aroundHubStudio.exception;

import java.util.Scanner;

public class ExceptionSample1 {

    Scanner scanner;

    public ExceptionSample1() {
        int input = 0;
        try {
            input = scanner.nextInt();
        } catch (RuntimeException e) {
            scanner = new Scanner(System.in);
            input = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        new ExceptionSample1();
    }

}