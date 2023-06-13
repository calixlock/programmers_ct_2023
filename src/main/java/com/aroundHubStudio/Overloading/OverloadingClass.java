package com.aroundHubStudio.Overloading;

public class OverloadingClass {
    public OverloadingClass() {
//        getName();
    }
    public void getName() {
        System.out.println("getName() : kim");
    }
    public void getName(String name){
        System.out.println("getName(String name) : "+name);
    }
    public void getName(String name,int age){
        System.out.println("getName(String name,int age) : "+name+" // "+age);
    }

    public static void main(String[] args) {
        new OverloadingClass().getName();
        new OverloadingClass().getName("na");
        new OverloadingClass().getName("park",20);
    }
}
