package com.IdeaProjects;

import java.util.PriorityQueue;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> arrayDeque=new PriorityQueue();
        arrayDeque.add(5);
        arrayDeque.add(6);
        arrayDeque.add(9);
        arrayDeque.add(7);
        arrayDeque.add(8);

//        arrayDeque.add(null);
        arrayDeque.add(5);
        while (!arrayDeque.isEmpty()) {
            System.out.print(arrayDeque.poll() + " ");
        }
//        System.out.print(arrayDeque);
    }
}
