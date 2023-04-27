package com.ll.level0.p120830;

public class Solution {
    public int solution(int n, int k) {
        int price_Lamb_Skewers = 12000;
        int price_Beverage = 2000;
        int add_Beverage = n/10;
        if (k-add_Beverage >= 0){
            return (n*price_Lamb_Skewers)+((k-add_Beverage)*price_Beverage);
        }
        return (n*price_Lamb_Skewers);
    }
}
class Solution2 {
    public int solution(int n, int k) {
        int lambTotalPrice = totalPrice(Menu.LAMB, n);
        int beverageTotalPrice = totalPrice(Menu.BEVERAGE, k);
        int surviceTotalPrice = survice(Menu.BEVERAGE, n);

        int billPrice = lambTotalPrice + beverageTotalPrice - surviceTotalPrice;
        return billPrice;
    }
    private int totalPrice(Menu menu, int lambAmount){
        return menu.getPrice() * lambAmount;
    }
    private int survice(Menu menu, int lambAmount){
        int check = lambAmount / 10;
        return menu.getPrice() * check;
    }

}
enum Menu{
    LAMB("양꼬치",12000),
    BEVERAGE("음료수",2000);
    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
