package com.example.codingpractice.ch2;

import java.util.*;

//2-4 다리를 지나는 트럭
/*public class CrossBridge {

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        int seconds = 0;
        int order = 0;

        Bridge<Truck> bridge = new Bridge<>(bridge_length, weight);

        bridge.offer(new Truck(truck_weights[0]));
        while(bridge.isEmpty()) {

            //1. 나갈 트럭이 있으면 내보냄
            if(bridge.peek().getPosition() > bridge.getBridgeLength())
                bridge.poll();

            //2. 현재 다리에 있는 트럭 + 뒤에 있는 트럭이 최대 무게는 넘는지 넘지 않으면 트럭을 다리에 올림
            if(bridge.getNowWeight() + truck_weights[order] <= bridge.getWeight()) {
                bridge.offer(new Truck(truck_weights[order++]));
            }

            //3. 트럭이 움직임
            for(Truck truck : bridge.)
                truck.movePosition();

            seconds++;

        }
        return seconds;
    }
}

class Bridge<Truck>{

    private int bridgeLength;
    private int nowWeight;
    private int weight;

    Bridge (int bridgeLength, int weight) {
        this.bridgeLength = bridgeLength;
        this.weight = weight;
    }

    public int getBridgeLength() {
        return bridgeLength;
    }

    public int getWeight() {
        return weight;
    }

    public int getNowWeight() {
        return nowWeight;
    }

    class Node<Truck> {
        private Truck truck;
        private Node<Truck> next;

        public Node(Truck data) {
            this.truck = data;
        }
    }

    private Node<Truck> first;
    private Node<Truck> last;

    public void offer(Truck item) {
        Node<Truck> t = new Node<>(item);

        if(last != null) last.next = t;

        last = t;
        if(first ==null) first = last;
    }

    public Truck poll() {
        if(first==null) return null;

        Truck data = first.truck;
        first = first.next;

        if(first==null) last = null;

        return data;
    }

    public Truck peek() {
        if(first==null) return null;

        return first.truck;
    }

    public boolean isEmpty() {
        return first == null;
    }
}

class Truck {

    private int weight;
    private int position;

    Truck(int weight) {
        this.weight = weight;
        this.position = 1;
    }

    public void movePosition() {

        this.position++;
    }

    public int getWeight() {

        return weight;
    }

    public int getPosition() {

        return position;
    }
}*/
