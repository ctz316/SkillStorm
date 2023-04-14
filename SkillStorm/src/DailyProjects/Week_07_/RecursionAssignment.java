package DailyProjects.Week_07_;

import java.util.Scanner;

public class RecursionAssignment {

    public static void main(String[] args) {

        // Start Scanner
        Scanner scanner = new Scanner(System.in);

        int start;
        int end;
        int n;
        int sum = 0;

        // Create Array
        int[] array = { 28, 17, 19, 100, 16, 36, 65, 12, 51, 32  };

        // Get input from user
        do {
            System.out.print("Enter the starting number: ");
            start = scanner.nextInt();
            System.out.print('\n' + "Enter the ending number: ");
            end = scanner.nextInt();
                if ((end < start)) {
                    throw new IllegalArgumentException("END must be greater than or equal to START");
                }
            } while (end < start);

            System.out.print('\n' + "Enter the value of n: ");
            n = scanner.nextInt();



        // Calling function and printing to screen
        System.out.println('\n' + "Sum of even numbers between " + start + " and " + end + " is: " + evenSum(array));

        boolean containsLargeValues = containsLargerThan(array, 100);
        System.out.println("Array contains values larger than 100: " + containsLargeValues);

        boolean containsLargerValues = containsLargerThan(array, n);
        System.out.println("Array contains values larger than " + n + ": " + containsLargerValues);

        // Closing scanner
        scanner.close();
    }

    public static int evenSum(int[] array) {
        return evenSumHelper(array, 0);
    }

    private static int evenSumHelper(int[] array, int index) {
        if (index >= array.length) {
            return 0;
        }
        int current = array[index];
        if (current % 2 == 0) {
            return current + evenSumHelper(array, index + 1);
        } else {
            return evenSumHelper(array, index + 1);
        }
    }

    public static boolean containsLargerThan(int[] array, int num) {
        return containsLargerThanHelper(array, num, 0);
    }

    private static boolean containsLargerThanHelper(int[] array, int num, int index) {
        if (index >= array.length) {
            return false;
        }
        if (array[index] > num) {
            return true;
        }
        return containsLargerThanHelper(array, num, index + 1);
    }
}