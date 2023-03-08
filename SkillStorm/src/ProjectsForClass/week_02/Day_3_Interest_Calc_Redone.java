package ProjectsForClass.week_02;

import java.util.Scanner;

public class Day_3_Interest_Calc_Redone {
        public static void main(String[] args) {

            // Reading Input to see which calculator to use//
            System.out.println("Will this be for simple interest or compound interest? type 'S' for simple and 'C' for compound interest: ");
            Scanner in = new Scanner(System.in);
            String answer = in.next();

            if (answer.equalsIgnoreCase("S")) {
                simpleInterest();
            }
            else if (answer.equalsIgnoreCase("C")) {
                compoundInterest();
            }
            else {
                System.out.println("Invalid entry. Please restart the program.");
            }

        }

        private static String simpleInterest() {

            // Declaring Variables
            double userOriginalAmount;
            double userInterestRate;
            int userNumberOfYears;

            // Getting user info
            System.out.print("Enter the amount: ");
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

        private static String compoundInterest() {

            // Creating Variables
            double userOriginalAmount;
            double userInterestRate;
            int userNumberOfMonths;
            double interestAccrued;

            // Reading Input //
            System.out.print("Enter the amount: ");
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