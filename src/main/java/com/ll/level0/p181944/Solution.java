package com.ll.level0.p181944;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0) System.out.printf(String.format("%d is even",n)); //System.out.println(n + " is even"); // System.out.printf("%d is even",n);
        else System.out.println(String.format("%d is odd",n)); // System.out.println(n + " is odd"); // System.out.printf("%d is odd",n);
    }
}
