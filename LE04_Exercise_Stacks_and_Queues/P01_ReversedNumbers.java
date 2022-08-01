package EXERCISES.LE04_Exercise_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_ReversedNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] inputNumbers = input.split("\\s+");

        ArrayDeque <String> stack = new ArrayDeque<>();

        for (String number : inputNumbers) {
            stack.push(number);
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
