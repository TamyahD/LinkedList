package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(11);
        sll.add(209);
        sll.add(7);
        sll.add(82);
        sll.add(850);

        System.out.println("List size: " +sll.size());

        System.out.println("Element at index 0: " +sll.get(0));

        System.out.println("Is there a 82 in the list? "+sll.contains(82));
        System.out.println("Is there a 65 in the list? "+sll.contains(65));
        System.out.println("Is there a 850 in the list? "+sll.contains(850));
        System.out.println("Is there a 11 in the list? "+sll.contains(11));
    }
}
