package org.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);

        myLinkedList.append(5);

        myLinkedList.insert(1, 1);

        myLinkedList.printList();
    }
}