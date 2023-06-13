package com.aroundHubStudio.encapsuation;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("kim");
        student.setAge(20);

        System.out.println("student.getName() = " + student.getName());
        System.out.println("student.getAge() = " + student.getAge());
    }
}
