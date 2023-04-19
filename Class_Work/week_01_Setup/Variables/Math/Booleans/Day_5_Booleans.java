package SkillStorm.Class_Work.week_01_Setup.Variables.Math.Booleans;

import java.util.Scanner;

public class Day_5_Booleans {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Setting up variables
            int num = 5;
            boolean bool = num == 5; // booleans can be boolean expressions


        // Examples
            System.out.println(bool); // print default condition
            System.out.println(!bool); // just prints opposite


            System.out.println(num == 5); // equality operator
            System.out.println(num > 5); // greater than operator
            System.out.println(num < 5); // less than operator
            System.out.println(num >= 5); // greater than or equal to operator
            System.out.println(num <= 5); // less than or equal to operator
            System.out.println(num != 5); // not equal to operator

        // Short-Circuit Operators
            System.out.println(num == 5 || num > 5); // true
            System.out.println(num == 5 && num > 5); // false
            System.out.println(num == 5 || num < 5); // true
            System.out.println(num == 5 && num < 5); // false
            System.out.println(num == 5 || !(num >= 4)); // num not greater than or equal to 4


        // IF statements
            if (num == 5) {
                System.out.println("num is 5");
            } else {
                System.out.println("num is not 5");
            }

            int value = 4;
            boolean expression = value == 5;
                if (expression) {
                    System.out.println("value is 5");
                }
                if (!expression) {
                    System.out.println("value is not 5");
                }
                if (value % 2 == 0) {
                    System.out.println("value is even");
                }
                if (value % 2 != 0) {
                    System.out.println("value is odd");
                }

            System.out.print("What's the best Destiny class?: ");
            String guess = in.nextLine();

                if (guess.equalsIgnoreCase("Knight")) {
                    System.out.println("Your Right!"); // Only here for demonstration that multiple things can happen in the do portion of this statement
                    System.out.println("We have swords so instantly the best");
                }
                System.out.println("Your Wrong!");

        // search for certain text in string
            System.out.println("What pizza topping do you want? ");
            String topping = in.nextLine();
            String acceptable = "Pineapple Pepperoni Chicken";
                if (topping.equalsIgnoreCase("Pineapple") ||
                    topping.equalsIgnoreCase("Pepperoni") ||
                    topping.equalsIgnoreCase("Chicken")) {
                        System.out.println("Great Choice!");
                }
                if (acceptable.contains(topping)) {
                    System.out.println("Hacky!");
                }
                if (topping.equalsIgnoreCase("Anchovies")) {
                    System.out.println("Ewww!");
                }

        // assign value based on user input
            int weight ; // not assigned (Initialized)
                if (topping.equalsIgnoreCase("Pineapple")) {
                    weight = 1;
                    System.out.println(weight);
                }
                if (topping.equalsIgnoreCase("Pepperoni")) {
                    weight = 2;
                    System.out.println(weight);
                }
                if (topping.equalsIgnoreCase("Chicken")) {
                    weight = 3;
                    System.out.println(weight);
                }

        // Do not need {} IF you only have 1 line of code - when you have more than 1 line of code, it will take the next line as outside of the if statement.
            int val = 10;
                if (val > 20)
                    System.out.println("That's a big number");
                System.out.println("Am I in the IF statement?"); // It will take the next line as outside of the if statement.

        // IF ELSE statements
                if (val >20) {
                    System.out.println("Lucky Number");
                }
                else {
                    System.out.println("Not your Lucky Number");
                }

        // IF ELSE statements with 1 line of code
                if (val >20)
                    System.out.println("1. Lucky Number");
                else
                    System.out.println("1. Not your Lucky Number");

        // Nested IF statements
                if (val >=20) {
                    System.out.println("Lucky Number");
                    if (val <= 30) {
                        System.out.println("Between 20 -30");
                    }
                    else {
                        System.out.println("Above 30");
                    }
                }
                else {
                    if (val >= 0) {
                        System.out.println("It's not negative");
                    }
                    else {
                        System.out.println("It's not your day");
                    }
                }

        in.close(); // *****   close scanner when done with it.   *****

    }
}
