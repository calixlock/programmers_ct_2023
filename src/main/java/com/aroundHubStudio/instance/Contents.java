package com.aroundHubStudio.instance;

public class Contents {
    private String name;
    private int age;

    public Contents() {
        System.out.println("Contents()의 생성자 생성");
    }

    public Contents(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Contents(String name, int age)의 생성자 생성");
    }
}
