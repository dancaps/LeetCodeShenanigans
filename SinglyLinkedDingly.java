package com.dancaps.leet;

/**
 * My implementation of a single linked list that contains a private Node class
 * @param <T> generic
 */
public class SinglyLinkedDingly<T> {
    Node head; //Holds a reference to the first Node in the list
    int size; //Tracks the number of Nodes in the list

    /**
     * Constructor to create an empty SinglyLinkedDingly list.
     */
    public SinglyLinkedDingly() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Private linked list Node
     */
    private class Node {
        T data; //Holds the generic data
        Node next; //Holds a reference to the next Node

        /**
         * Constructor to create a new Node in the list.
         * @param data generic
         * @param nextNode link to the next Node
         */
        public Node(T data, Node nextNode) {
            this.data = data;
            this.next = nextNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    /**
     * Adds a new element to the front of the list
     */
    public void add(T data) {
        //Creates the new node with the data and sets the next field to the head and assigns this node as the new head
        this.head = new Node(data, this.head);
        size++;
    }

    /**
     * Checks if the list is empty.
     * @return boolean
     */
    public boolean isEmpty() {
        return this.size() == 0;
    }

    /**
     * Removes and returns the first element in the list.
     * @return T data
     */
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T result = head.data;
        this.head = head.next;
        size--;
        return result;

    }

    /**
     * Gets the size of the list.
     * @return int
     */
    public int size() {
        return size;
    }

    /**
     * Building a return string with the values in brackets.
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.size());
        sb.append("[");

        for (Node n = head; n != null; n = n.next) {
            sb.append(n.data).append(", ");
        }
        if (sb.length() > 3) {
            sb.delete(sb.length()-2, sb.length());
        }
        sb.append("]");

        return sb.toString();
    }
}
