package Class_Work.week_02_Methods.Arrays.Loops;

import java.util.Scanner;

public class Day_5_Loops_Continued {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

            // Sections calls
            // whileLoopSection();
            // doWhileLoopSection();
            // forLoopSection();
            // forEachLoopSection();
            // carPrompt(in);
            // shorterCarPrompt(in);
            // forLoopExamples();
            forEachIceCream();




    }


        // while loop //
            public static void whileLoopSection() {
                System.out.println("*** While Loop ***");
                int count = 0;
                while (count < 3) {
                    System.out.println(count);
                    count++;
                }
                System.out.println();
            }

        // do while loop //
            public static void doWhileLoopSection() {
                System.out.println("*** Do While Loop ***");
                int a = 0;
                do {
                    System.out.println(a);
                    a++;
                } while (a < 3);
                System.out.println();
            }

        // For loop
            public static void forLoopSection() {
                System.out.println("*** For Loop ***");
                for (int i = 0; i < 3; i++) {
                    System.out.println(i);
                }
                System.out.println();
            }

        // For Each Loop
            public static void forEachLoopSection() {
                int[] nums = { 0, 1, 2 };
                for ( int num : nums) {
                    System.out.println(num);
                }
                System.out.println();
            }

        // Car Prompt
            public static void carPrompt(Scanner input) {
                System.out.println("Enter a car brand: ");
                String car = input.nextLine();

                while (car.trim().equalsIgnoreCase("Volkswagen") ||
                        car.trim().equalsIgnoreCase("VW") ||
                        car.trim().equalsIgnoreCase("")) {
                    System.out.println("That car sucks, Pick a better one.");
                    System.out.println("Enter car brand: ");
                    car = input.nextLine();
                }

                System.out.println("Great Choice!");
            }

        // Shorter Car Prompt
            public static void shorterCarPrompt(Scanner input) {
                String car = "";

                do {
                    if     (car.trim().equalsIgnoreCase("Volkswagen") ||
                            car.trim().equalsIgnoreCase("VW")) {
                            System.out.println("That brand sucks, Choose a different one. ");
                    }

                    System.out.print("Enter a valid car brand: ");
                    car = input.nextLine();

                } while    (car.trim().equalsIgnoreCase("Volkswagen") ||
                            car.trim().equalsIgnoreCase("VW") ||
                            car.trim().equals(""));


            }

        // For loop
            public static void forLoopExamples() {

                // Setting array up
                    String[] flavors = {
                            "Vanilla",
                            "Chocolate",
                            "Mint",
                            "Cookie Dough",
                            "Strawberry",
                            "Salted Caramel",
                            "Rum Raisin"
                    };

                    System.out.println("Ice Cream Flavors");

                // for loop
                    for (int i = 0; i < flavors.length; i++) {
                    System.out.println(flavors[i]);
                    }

                // for loop moved ++
                    for (int i = 0; i < flavors.length; ) {
                        System.out.println(flavors[i++]);
                    }

                // Create topping array
                    String[] toppings = {
                            "M&M's",
                            "Chocolate Chips",
                            "Oreo's",
                            "Kit Kat's",
                            "Sprinkles",
                            "Chocolate Syrup",
                            "Caramel",
                            "Strawberry",
                            "Reese's",
                            "Whipped Cream"
                    };

                // Nesting Loops through an array with another array
                    for (int i = 0; i < flavors.length; i++) {

                        for (int j =0; j < toppings.length; j++) {
                            String bowl = flavors[i] + " and " + toppings[j];

                            System.out.println(bowl);
                        }
                    }
            }

            // For Each Ice Cream
            public static void forEachIceCream() {
                String[] flavors = { "Vanilla",
                        "Chocolate",
                        "Mint",
                        "Cookie Dough",
                        "Strawberry",
                        "Rum Raisin",
                        "Salted Caramel" };

                String[] toppings = { "M&Ms",
                        "Chocolate Chips",
                        "Oreos",
                        "Kit Kats",
                        "Sprinkles",
                        "Chocolate Syrup",
                        "Caramel",
                        "Strawberry",
                        "Reese's",
                        "Whipped Cream" };

                System.out.println("***** Ice Cream *****");
                // no indexes, executes once for every value in the array
                for (String flavor : flavors) {
                    for (String topping : toppings) {
                        String bowl = flavor + " and " + topping;

                        System.out.println(bowl);
                    }
                }
            }






}
