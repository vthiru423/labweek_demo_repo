public class MaxNumber {

    public static void main(String[] args) {
        // Declare and initialize variables
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        int max = numbers[0];

        // Calculate sum of numbers
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Find maximum number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print sum and maximum number
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Maximum number: " + max);
    }
}
