package SkillStorm.DailyProjects.week_02;

import java.util.Scanner;

public class Day_3_Interest_Calc_Redone {
        public static void main(String[] args) {

            // Setting variable
                String answer;

            // Do While loop to verify user input is correct
                do {
                    // Reading Input to see which calculator to use//
                        System.out.println("Will this be for simple interest or compound interest? type 'S' for simple and 'C' for compound interest: ");
                        Scanner in = new Scanner(System.in);
                        answer = in.next();
                } while ((!answer.equalsIgnoreCase("S")) && !answer.equalsIgnoreCase("C")) ;

                // Switching to correct calculations based on user input
                        if (answer.equalsIgnoreCase("S")) {
                            simpleInterest();
                        } else if (answer.equalsIgnoreCase("C")) {
                            compoundInterest();
                        }
        }

        // Setting up calculation for Simple Interest Calculation
                private static String simpleInterest() {

            // Declaring Variables
                double userOriginalAmount;
                double userInterestRate;
                int userNumberOfYears;

            // Getting user info
                System.out.print("Simple Interest Calculator: Enter the amount: ");
                Scanner in = new Scanner(System.in);
                userOriginalAmount = in.nextDouble();

                System.out.print("Enter the interest rate: ");
                userInterestRate = in.nextDouble();

                System.out.print("Enter the number of years: ");
                userNumberOfYears = in.nextInt();
                in.close();

            // Calculating Interest //
                double interestAccrued = (userOriginalAmount * (1 + ((userInterestRate * .01) * userNumberOfYears)) - userOriginalAmount);

            // Printing Results //
                return System.out.printf("The interest accrued is: $%.2f%n", interestAccrued).toString(); // Printing the interest accrued in a correct format
        }

        // Setting up calculation for Simple Interest Calculation
        private static String compoundInterest() {

            // Creating Variables
                double userOriginalAmount;
                double userInterestRate;
                int userNumberOfMonths;
                double interestAccrued;

            // Reading Input //
                System.out.print("Compound Calculator: Enter the amount: ");
                Scanner in = new Scanner(System.in);
                userOriginalAmount = in.nextDouble();

                System.out.print("Enter the interest rate: ");
                userInterestRate = in.nextDouble();

                System.out.print("Enter the number of Months: ");
                userNumberOfMonths = in.nextInt();
                in.close();

            // Calculating Interest //
                interestAccrued = (userOriginalAmount * Math.pow(1 + ((userInterestRate * .01) / 12), userNumberOfMonths)) - userOriginalAmount;

            // Printing Results //
                return System.out.printf("The interest accrued is: $%.2f%n", interestAccrued).toString();
        }
}