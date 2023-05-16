package com.ll.level0.p181946;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();;

//        System.out.println(a+b); // method1
//        System.out.println(a.concat(b)); // method2
        System.out.println((a+b).replace(" ","")); //method3
//        System.out.print(a);System.out.print(b); // method4
//        System.out.println(String.join("", a, b)); // method5
    }
}
