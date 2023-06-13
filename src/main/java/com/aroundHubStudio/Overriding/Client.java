package com.aroundHubStudio.Overriding;

public class Client {
    public Client() {
        FoodMarket foodMarket = new FoodMarket();
        foodMarket.stack("빵",5,1200);
        foodMarket.stack("라면",3, 800);
        foodMarket.buy("빵");
        foodMarket.buy("라면");
        FishMarket fishMarket = new FishMarket();
        fishMarket.stack("고등어",10,4000);
        fishMarket.stack("갈치",33, 2500);
        fishMarket.buy("도미");
        fishMarket.buy("고등어");
    }

    public static void main(String[] args) {
        new Client();

    }
}
