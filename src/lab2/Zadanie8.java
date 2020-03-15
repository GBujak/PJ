package lab2;

import lab2.Stack;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        var stack = new Stack();
        var scanner = new Scanner(System.in);

        System.out.print("Ilość wartości: ");
        int len = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < len; i++) {
            stack.push(scanner.nextInt());
        }

        while (stack.getSize() != 0) {
            System.out.println(stack.get());
            stack.pop();
        }
    }
}
