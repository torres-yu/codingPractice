package com.example.codingpractice.ch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//문자열 내 마음대로 정렬하기
public class Strings {

    public String[] solution(String[] strings, int n) {

        List<OrderData> orderDatas = new ArrayList<>();

        for(String s : strings)
            orderDatas.add(new OrderData(s.charAt(n), s));

        Collections.sort(orderDatas, new OrderData());

        return orderDatas.stream()
                .map(orderData -> orderData.getOrderSt())
                .toArray(String[]::new);
    }
}

class OrderData implements Comparator<OrderData>{

    private char orderCh;
    private String orderSt;

    public OrderData(char orderCh, String orderSt) {
        this.orderCh = orderCh;
        this.orderSt = orderSt;
    }

    public String getOrderSt() {
        return orderSt;
    }

    public OrderData() {}

    @Override
    public int compare(OrderData o1, OrderData o2) {
        if(o1.orderCh!=o2.orderCh)
            return Character.compare(o1.orderCh, o2.orderCh);
        else
            return o1.orderSt.compareTo(o2.orderSt);
    }
}


