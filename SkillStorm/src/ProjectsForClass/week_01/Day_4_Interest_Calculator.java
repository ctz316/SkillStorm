package ProjectsForClass.week_01;

import java.util.Scanner;

public class Day_4_Interest_Calculator {
    public static void main(String[] args) {


        // Setting Variables //
            double originalAmount = 0.0;
            double intrestRate = 0.0;
            double numberOfYears = 0.0;
            double interestAccrued = 0.0;
            double userOriginalAmount = 0.0;
            double userIntrestRate = 0.0;
            int monthsOfYear = 12;
            int numberOfMonths = 0;


        // Reading Input to see which calculator to use//
            System.out.println("Will this be for simple interest or compound interest? type 'S' for simple and 'C' for compound interest:");
            Scanner in = new Scanner(System.in);
            String answer = in.next();



            if (answer.equalsIgnoreCase("S")) {
                // Reading Input //
                System.out.print("Enter the amount: ");
                userOriginalAmount = in.nextDouble();
                System.out.print("Enter the interest rate: ");
                System.out.print("Enter the number of years: ");
                double userNumberOfYears = in.nextDouble();

                // Calculating Interest //
                interestAccrued = (userOriginalAmount * (1 + ((userIntrestRate * .01) * userNumberOfYears)) - userOriginalAmount);

                // Printing Results //
                System.out.println("The interest accrued is: " + interestAccrued);
                System.out.printf("The interest accrued is: $%.2f%n", interestAccrued); // Printing the interest accrued in a correct format
            }

            else if (answer.equalsIgnoreCase("C")) {

                // Reading Input //
                System.out.print("Enter the amount: ");
                userOriginalAmount = in.nextDouble();
                System.out.print("Enter the interest rate: ");
                userIntrestRate = in.nextDouble();
                System.out.print("Enter the number of Months: ");
                int userNumberOfMonths = in.nextInt();

                // Calculating Interest //
                interestAccrued = (userOriginalAmount * Math.pow(1 + ((userIntrestRate * .01) / 12), userNumberOfMonths)) - userOriginalAmount;

                // Printing Results //
                System.out.println("The interest accrued is: " + interestAccrued);
                System.out.printf("The interest accrued is: $%.2f%n", interestAccrued);
            }

            else {
                System.out.println("Invalid selection. Please run the program again.");
                in.next();
            }
    }

}

