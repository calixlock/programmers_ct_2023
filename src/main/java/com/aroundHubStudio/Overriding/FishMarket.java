package com.aroundHubStudio.Overriding;

import java.util.ArrayList;

public class FishMarket implements Market{
    private ArrayList<String> productList;
    private ArrayList<Integer> size, value;

    public FishMarket() {
        System.out.println("FishMarket 생성자 실행 List 생성");
        productList = new ArrayList<>();
        size = new ArrayList<>();
        value = new ArrayList<>();
    }

    @Override
    public void stack(String product, int quantity, int value) {
        this.productList.add(product);
        this.size.add(quantity);
        this.value.add(value);
    }

    @Override
    public void buy(String product) {
        String prd = "";
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).equalsIgnoreCase(product)){
                prd = productList.get(i);
                index = i;
            }
        }if (prd.equalsIgnoreCase("")){
            System.out.println(product+"는 존재하지 않습니다");
            return;
        }if (size.get(index)>0){
            int s = size.get(index);
            s--;
            size.set(index,s);
            System.out.print("구매 완료. 상품명 : %s , 남은재고 : %d, 금액 : %d\n".formatted(prd,s,value.get(index)));
        }else {
            System.out.println(product+"의 재고는 없습니다.");
        }
    }
}
