package com.aroundHubStudio.exception;

import java.util.Scanner;

public class TryCatch {
    public TryCatch() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try{
            int changeInput = Integer.parseInt(input);
            System.out.println("changeInput = " + changeInput);
        }catch (NumberFormatException e){
            System.out.println("exception 발생 / input = " + input);
            System.out.println("exception class = " + e.getClass());
        }finally {
            System.out.println("finally 실행");
        }
    }

    public static void main(String[] args) {
        new TryCatch();
    }
}
