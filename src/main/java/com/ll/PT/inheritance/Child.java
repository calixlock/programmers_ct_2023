package com.ll.PT.inheritance;

public class Child extends Parent {
    public Child() {
        System.out.println("Child noArgConstructor");
    }

    @Override
    public void printName() {
//        super.printName(); // 부모의 기능 그대로 사용시
        System.out.println("Child Override printName"); // override 적용됨
    }
}
