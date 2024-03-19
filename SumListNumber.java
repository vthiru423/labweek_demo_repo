import java.util.*;

public class UglyCode {

    public static void main(String[] args) {
        // Create a list of numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Calculate the sum of all numbers
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        System.out.println("Sum of numbers: " + sum);

        // Find the maximum number
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("Maximum number: " + max);

        // Sort the numbers in descending order
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println("Sorted numbers in descending order: " + numbers);

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
            }
        }
        System.out.println();
    }
}
