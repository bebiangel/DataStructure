package datastructure.week7.stack;

import java.util.NoSuchElementException;

public class StringStack implements MyStringStack {
    //
    private Node head;

    public StringStack() {
        //
        this.head = null;
    }

    @Override
    public boolean empty() {
        //
        if (head == null) {
            return true;
        }

        return false;
    }

    @Override
    public String push(String element) {
        //
        Node newNode = new Node(element);

        newNode.next = head;
        head = newNode;

        return newNode.element;
    }

    @Override
    public String pop() {
        //
        if (empty()) {
            throw new NoSuchElementException("Stack Underflow");
        }

        String element = head.element;
        head = head.next;
       
        return element;
    }

    @Override
    public String peek() {
        //
        if (empty()) {
            throw new NoSuchElementException("Stack Underflow");
        }

        return head.element;
    }

    @Override
    public int search(String element) {
        //
        if (empty()) {
            throw new NoSuchElementException("Stack Underflow");
        }

        int position = -1;
        int index = 0;
        Node targetNode = head;

        while (targetNode != null) {
            //
            if (targetNode.element.equals(element)) {
                position = index + 1;
                break;
            }

            targetNode = targetNode.next;
            index++;
        }

        return position;
    }

    private class Node {
        //
        private Node next;
        private String element;

        public Node(String element) {
            //
            this.next = null;
            this.element = element;
        }
    }
}