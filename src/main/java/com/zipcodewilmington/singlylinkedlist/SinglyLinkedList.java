package com.zipcodewilmington.singlylinkedlist;

import java.util.Objects;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node headNode;
    Node tailNode;
    Node currentNode;
    Integer size=0;

    public SinglyLinkedList() {
//        this.size=getSize();
    }


    public void add(Integer newNodeValue) {
/*
        if head node is null, then priorize using headNode when adding new nodes
        tail node will also equal head node
        next node after tail/head will be empty aka null
*/
        if (headNode==null) {
            headNode = new Node(newNodeValue);
            size++;
            tailNode = headNode;
            tailNode.nextNode = new Node(null);
        }
        else {
            tailNode.nextNode = new Node(newNodeValue);
            tailNode=tailNode.nextNode;
            size++;
//            tailNode = tailNode.nextNode;
//            size++;
            tailNode.nextNode = new Node(null);
        }
    }

    /*TODO add comments*/
    public boolean contains(Integer nodeValue) {
        currentNode = headNode;
        while (currentNode != null) {
            for (int idx=0; idx<size; idx++) {
                if (currentNode.nodeValue.equals(nodeValue)) {
                    return true;
                }
                if (currentNode.nextNode.nodeValue != null) {
                    currentNode = currentNode.nextNode;
                    if (currentNode.nodeValue.equals(nodeValue)) {
                        return true;
                    }
                }
            }
            break;
        }
        return false;
    }

    /*TODO add comments*/
    Integer size() {
//        int size=1;
        currentNode = headNode;
        while (currentNode !=null) {
            size++;
            if (currentNode.nextNode.nodeValue != null) {
                currentNode = currentNode.nextNode;
            }
            else {
                size--;
                break;
            }
        }
        return this.size=size;
    }

    /*TODO add comments*/
    Node get(Integer nodeIndexValue) {
        while (headNode != null) {
            currentNode = headNode;
            for (int indexCounter=0; indexCounter<size; indexCounter++) {
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

    void remove(Integer nodeIndexValue) {
        Node temp = new Node();
        while (headNode != null) {
            currentNode = headNode;
            for (int index=0; index<=nodeIndexValue; index++) {
//                currentNode=currentNode.nextNode;
                if (nodeIndexValue==0) {
                    temp=headNode;
                    headNode=temp.nextNode;
//                    currentNode.equals(new Node());
//                    currentNode.nodeValue=null;
//                    currentNode=tailNode.nextNode;
                    this.size--;
                    return;
                }
                else {
                    if(index==nodeIndexValue) {
                        //TODO >:( still does not remove indexed node correctly
//                        currentNode=get(nodeIndexValue);
                        temp=currentNode;
                        currentNode=temp.nextNode;
//                        currentNode.equals(new Node());
//                        currentNode=null;
//                        currentNode=tailNode.nextNode;
                        this.size--;
                    }
                }
            }
            break;
        }
    }

    Integer find(Integer nodeIndexValue) {return -1;}
    SinglyLinkedList copy(SinglyLinkedList singlyLinkedList) {return null;}
    SinglyLinkedList sort(SinglyLinkedList singlyLinkedList) {return null;}

    public Node getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }

    public Node getTailNode() {
        return tailNode;
    }

    public void setTailNode(Node tailNode) {
        this.tailNode = tailNode;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
