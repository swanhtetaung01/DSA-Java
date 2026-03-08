package org.datastructures.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        if (length == 0) System.out.println("null");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0)
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void removeLast() {
        if (length == 0) throw new RuntimeException("LinkedList is already null");
        Node pointer = head;
        Node pre = head;
        while (pointer.next != null) {
            pre = pointer;
            pointer = pointer.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
    }

    public void removeFirst() {
        if (length == 0) throw new RuntimeException("LinkedList is already null");
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) 
            tail = null;
    }

    public Node get(int index) {
        if (index < 0 || index > length) return null;
        Node pointer = head;
        for (int i = 0; i < index; i++)
            pointer = pointer.next;
        return pointer;
    }

    public boolean set(int index, int value) {
        Node pointer = get(index);
        if (pointer != null) {
            pointer.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0)
            prepend(value);
        if (index == length)
            append(value);
        Node temp = get(index - 1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        return true;
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
