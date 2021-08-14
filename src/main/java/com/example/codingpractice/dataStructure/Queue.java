package com.example.codingpractice.dataStructure;

import java.util.NoSuchElementException;

public class Queue<T>{

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void offer(T item) {
        Node<T> t = new Node<>(item);

        //기존 마지막의 next가 t를 가리키도록 하고 t를 마지막으로 넣어준다.
        if(last != null){
            last.next = t;
        }
        last = t;
        if(first ==null) {
            first = last;
        }
    }

    public T poll() {
        if(first==null) throw new NoSuchElementException();

        T data = first.data;
        first = first.next;

        if(first==null) last = null;

        return data;
    }

    public T peek() {
        if(first==null)  throw new NoSuchElementException();

        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
