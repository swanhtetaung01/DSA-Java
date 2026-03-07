package org.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(5);

        myLinkedList.removeLast();

        myLinkedList.printList();

        myLinkedList.removeLast();
        myLinkedList.printList();
    }
}