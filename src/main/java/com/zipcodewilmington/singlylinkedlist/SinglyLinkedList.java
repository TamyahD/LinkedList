package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node headNode;
    Node tailNode;
    Node currentNode;

    public SinglyLinkedList() {

    }


    public void add(Integer newNodeValue) {
/*
        if head node is null, then priorize using headNode when adding new nodes
        tail node will also equal head node
        next node after tail/head will be empty aka null
*/
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
    }

    public boolean contains(Integer nodeValue) {
        currentNode = headNode;
        while (currentNode != null) {
            if (currentNode.nodeValue.equals(nodeValue)) {
                return true;
            }
            if (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            if (currentNode.nextNode == null) {
                return false;
            }
        }
        return false;
    }

    void remove(Integer nodeIndexValue) {}
    Integer find(Integer nodeIndexValue) {return -1;}

    /*TODO add comments*/
    Integer size() {
        int size=-1;
        Node currentNode = headNode;
        while (currentNode !=null) {
            size++;
            if (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            else {
                break;
            }
        }
        return size;
    }

    /*TODO add comments*/
    Node get(Integer nodeIndexValue) {
        while (headNode != null) {
            currentNode = headNode;
            for (int indexCounter=0; indexCounter<=size(); indexCounter++) {
               if (indexCounter == nodeIndexValue) {
                   return currentNode;
               }
               else {
                   currentNode = currentNode.nextNode;
               }
            }
        }
        return null;
    }

    SinglyLinkedList copy(SinglyLinkedList singlyLinkedList) {return null;}
    SinglyLinkedList sort(SinglyLinkedList singlyLinkedList) {return null;}
}
