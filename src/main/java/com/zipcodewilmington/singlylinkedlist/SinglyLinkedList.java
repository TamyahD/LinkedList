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
        if (headNode==null) {
            headNode = new Node(newNodeValue);
            tailNode = headNode;
            tailNode.nextNode = new Node(null);
        }
        else {
            tailNode.nextNode = new Node(newNodeValue);
            tailNode = tailNode.nextNode;
            tailNode.nextNode = new Node(null);
        }
/*
        if (headNode==null && tailNode==null) {
            headNode=newNode;
            tailNode=newNode;
        }
        else {
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
*/
    }
    public boolean contains(Node node) {
//        for (Node n : SinglyLinkedList) {
//            if (n.nodeValue ==node
//        }
        return false;
    }
    void remove(Integer nodeIndexValue) {}
    Integer find(Integer nodeIndexValue) {return -1;}

    Integer size() {
        int size=0;
        Node currentNode = headNode;
        while (currentNode !=null) {
            size++;
            currentNode = currentNode.nextNode;
        }
        return size-1;
    }

    Integer get(Integer nodeIndexValue) {return 0;}
    SinglyLinkedList copy(SinglyLinkedList singlyLinkedList) {return null;}
    SinglyLinkedList sort(SinglyLinkedList singlyLinkedList) {return null;}
}
