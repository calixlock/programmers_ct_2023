package com.ll.PT;

import java.util.Arrays;

public class practice_01_gugudan {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("%d x %d = %d\t".formatted(i,j,i*j));
            }
            System.out.println();
        }
    }
}
