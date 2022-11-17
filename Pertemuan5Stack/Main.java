package Pertemuan5Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(150);
        stack.push(23);
        System.out.println(stack);

        int elemen1 = stack.pop();
        System.out.println(stack);

        int elemen2 = stack.peek();
        System.out.println(stack);

        // push = masukin ke stack paling atas
        // pop = ngambil elemen teratas dari stack
        // peek = ngeliat elemen teratas dari stack
    }
}
