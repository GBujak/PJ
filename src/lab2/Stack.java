package lab2;

import java.util.Date;

public class Stack {
    // Zadanie 13
    static int stacksCreated = 0;
    public static int getStacksCreated() {
        return stacksCreated;
    }

    static class Node {
        public int val;
        public Node next;
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // Zadanie 9
    int minVal = 0;
    int maxVal = 0;
    boolean confine = false;

    // Zadanie 10 i 11
    Date lastModified = new Date();
    int modifyCount = 0;

    Node top = null;
    int size = 0;

    // Zadanie 9
    void confine(int minVal, int maxVal) {
        confine = true;
        this.minVal = minVal;
        this.maxVal = maxVal;
    }

    // Zadanie 9
    public Stack() {
        // Zadanie 13
        stacksCreated++;
    }
    public Stack(int minVal, int maxVal) {
        this();
        confine(minVal, maxVal);
    }

    public int getSize() {
        return size;
    }

    public int get() {
        if (top == null)
            throw new IllegalStateException(
                    "Pusty stos");
        return top.val;
    }

    public void push(int val) {
        // Zadanie 9
        if (confine && (val < minVal || val > maxVal))
            throw new IllegalArgumentException(
                    "Wartość nie mieści się w przedziale");
        size++;
        top = new Node(val, top);

        logModify();
    }

    public void pop() {
        if (size == 0)
            throw new IllegalStateException(
                    "Usuwanie z pustego stosu");
        size--;
        top = top.next;

        logModify();
    }

    // Zadanie 11
    public void clear() {
        top = null;
        size = 0;
    }

    // Zadanie 10 i 12
    void logModify() {
        lastModified = new Date();
        modifyCount++;
    }

    // Zadanie 10 i 12
    public Date getLastModified() {
        return lastModified;
    }
    public int getModifyCount() {
        return modifyCount;
    }
}