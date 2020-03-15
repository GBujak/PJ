package lab2;

import lab2.Stack;

public class ZadaniaOd9Do13 {
    public static void main(String[] args) {
        // Zadanie 13
        for (int i = 0; i < 20; i++)
            new Stack();

        System.out.println(Stack.getStacksCreated()); // 20

        // Zadanie 9
        var stack = new Stack(0, 100);
        // stack.push(200);  // IllegalArgumentException
        stack.push(100); // OK

        // Zadanie 10 i 12
        System.out.println(stack.getLastModified());
        System.out.println(stack.getModifyCount());

        // Zadanie 11
        stack.push(10);
        stack.clear();
        System.out.println(stack.getSize()); // 0
    }
}
