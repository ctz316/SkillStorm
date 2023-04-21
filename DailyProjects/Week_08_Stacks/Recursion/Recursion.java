package SkillStorm.DailyProjects.Week_08_Stacks.Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {

    // Scanner open
    private static Scanner in = new Scanner(System.in);

    // Variables
    private static float factorialNumber;

    public static void main(String[] args) {

        // Error catching and also running the classes
        try {
            getNumberToFactorial();
            System.out.println("You have chosen the number " + factorialNumber + " to do a factorial number calculation.");
            float result = calculateFactorial(factorialNumber);
            System.out.println("Factorial of " + factorialNumber + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong input: " + e.getMessage());
        }
    }

    // class for getting user input while error checking
    private static void getNumberToFactorial() {

        // local variables
        float temp;

        // asking for input and checking for correct response
        System.out.println("What number would you like to do the factorial on?");
        temp = in.nextFloat();
        if (temp < 0 || temp % 1 != 0) {
            throw new IllegalArgumentException("Positive integers please.");
        } else {
            factorialNumber = temp;
        }
    }

    // class for the actual math
    private static float calculateFactorial(float n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
