package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(5);
        sll.add(2);
        sll.add(7);
        sll.add(8);
        System.out.println(sll.size());
    }
}
