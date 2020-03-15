package lab2;

import lab2.Stack;

public class Zadanie7 {
    public static void main(String[] args) {
        var stack = new Stack();
        for (int i = 0; i < 100; i++)
            stack.push(i);

        while (stack.getSize() != 0) {
            System.out.println(stack.get());
            stack.pop();
        }
    }
}
