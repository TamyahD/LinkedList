package com.zipcodewilmington.singlylinkedlist;

public class Node {
    Integer nodeValue;
    Boolean hasNextNode;
    Node nextNode;

    Node() {

    }
    Node(Integer value, boolean hasNextNode, Node nextNode) {
        this.nodeValue=value;
        this.hasNextNode=hasNextNode;
        this.nextNode = nextNode;
    }
//    Node(Integer value, Node nextNode) {
//        this.nodeValue=value;
//        this.nextNode=nextNode;
//    }
    Node(Integer value) {
        this.nodeValue=value;
        this.nextNode = null;
    }
}
