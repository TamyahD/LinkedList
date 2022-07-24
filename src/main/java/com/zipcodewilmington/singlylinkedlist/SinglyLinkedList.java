package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node headNode;
    Node tailNode;

    public SinglyLinkedList() {

    }


    public void add(Integer newNodeValue) {
        Node newNode = new Node(newNodeValue);
        if (headNode==null && tailNode==null) {
            headNode=newNode;
            tailNode=newNode;
        }
        else {
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
    }
    void remove(Integer nodeIndexValue) {}
    boolean contains(Node node) {return false;}
    Integer find(Integer nodeIndexValue) {return -1;}
    Integer size(SinglyLinkedList singlyLinkedList) {return 0;}
    Integer get(Integer nodeIndexValue) {return 0;}
    SinglyLinkedList copy(SinglyLinkedList singlyLinkedList) {return null;}
    SinglyLinkedList sort(SinglyLinkedList singlyLinkedList) {return null;}
}
