package com.ym.learn.exercises;

/**
 * 链栈
 *
 * @param <T>
 */
public class LinkStack<T> {

    public class Node {
        private T data;

        private Node next;

        public Node() {
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public Node top;

    public int size;

    public LinkStack() {
        top = null;
    }

    public void push(T element) {
        top = new Node(element, top);
        size++;
    }

    public int length() {
        return size;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
