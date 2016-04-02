package yulongproductions.com.numbermutator;

import java.util.NoSuchElementException;

/**
 * Created by Yulong on 4/1/2016.
 */
public class LinkedStack<E> {
    private StackNode front;
    private int count;

    public LinkedStack() {
        this.front = null;
        this.count = 0;
    }

    public void push(E e) {
        this.count++;
        this.front = new StackNode(e, this.front);
    }

    public E pop() {
        if (this.front == null) {
            throw new NoSuchElementException();
        }
        E data = (E) this.front.data;
        this.front = this.front.next;
        this.count--;
        return data;
    }

    public E peek() {
        if (this.front == null) {
            throw new NoSuchElementException();
        }
        return (E) this.front.data;
    }
}