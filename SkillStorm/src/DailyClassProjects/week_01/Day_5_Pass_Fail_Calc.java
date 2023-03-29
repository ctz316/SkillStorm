package DailyClassProjects.week_01;

import java.util.Scanner;

public class Day_5_Pass_Fail_Calc {

    public static void main(String[] args) {

        // Create Pass Fail Calculator //

            // Getting info from user to use as variables
                System.out.println("Please enter a percentage between 0 and 100 :");
                Scanner in = new Scanner(System.in);
                double percentage = in.nextDouble();
    
            // Output to user
                if (percentage < 60) {
                    System.out.println("You have failed. \n Your grade is an \"F\"");
                }
                    else if (percentage >= 60 && percentage < 70) {
                        System.out.println("You have failed. \n Your grade is an \"D\"");
                    }
                    else if (percentage >= 70 && percentage < 80) {
                        System.out.println("You have passed! \n Your grade is a \"C\"");
                    }
                    else if (percentage >= 80 && percentage < 90) {
                        System.out.println("You have passed! \n Your grade is a \"B\"");
                    }
                    else if (percentage >= 90 && percentage <= 100) {
                        System.out.println("You have passed! \n Your grade is a \"A\"");
                    }
                else {
                    System.out.println("You did not enter a valid percentage. Please re-run this program again");
                }

            // Close Scanner
                in.close();

    }
}
