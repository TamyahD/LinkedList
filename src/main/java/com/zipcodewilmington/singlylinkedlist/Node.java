package com.zipcodewilmington.singlylinkedlist;

 class Node {
    Integer nodeValue;
    Node nextNode;
//    Boolean hasNextNode;

    Node() {

    }
//    Node(Integer value, Node nextNode) {
//        this.nodeValue=value;
//        this.nextNode = nextNode;
//        this.hasNextNode=hasNextNode;
//    }
//    Node(Integer value, Node nextNode) {
//        this.nodeValue=value;
//        this.nextNode=nextNode;
//    }
    Node(Integer value) {
        this.nodeValue=value;
//        this.nextNode = null;
    }

    @Override
    public String toString() {
        return nodeValue.toString();
    }
}
