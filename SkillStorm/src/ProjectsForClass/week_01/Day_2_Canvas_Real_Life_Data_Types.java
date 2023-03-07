package ProjectsForClass.week_01;

import java.util.Scanner;

public class Day_2_Canvas_Real_Life_Data_Types {
    public static void main(String[] args) {
        // Getting information from user to do calculations. //

            Scanner in = new Scanner(System.in); // Setting up scanner to accept input

            System.out.println("What is your first name? "); // Getting info
            String fName = in.nextLine();

            System.out.println("What year were you born? (Example 2023) "); // Getting info
            short dateOfBirth = in.nextShort();

            System.out.println("Have you had your birthday for the year 2023? Enter true or false "); // Getting info
            boolean birthDay2023 = in.nextBoolean();

            System.out.println("How tall are in in inches? "); // Getting info
            byte tall = in.nextByte();

            System.out.println("How much do you weigh in pounds? "); // Getting info
            float weight = in.nextFloat();

            System.out.println("Enter a number from 33 to 47? "); // Getting info
            int symbol = in.nextInt();


        // Setting up variables for calculations. //

            int age = 0;


        // Doing calculations //

            // Age //
                if (birthDay2023 == true) {
                        age = 2023 - dateOfBirth;
                    }
                else if (birthDay2023 == false) {
                        age = 2022 - dateOfBirth;
                    }

            // lbsHeight //
                float lbsHeight = (float) (weight / tall);

            // breath //

                long breath = (long) (age * 8409600L);

            // beats //

                long beats = age * 42075904L;

            // Lucky Number //

                short luckyNumber = (short) (Math.random() * symbol);

            // luckySign //

                char luckySign = (char) (Math.random() * 2 + 1);

        // Formatting system out. //

            System.out.println("Hello, " + fName + " You are currently " + age + " years old. ");
            System.out.println("     Some interesting facts about your life so far: ");
            System.out.println("1. You are on average " + lbsHeight + "lbs per inch in height.");
            System.out.println("2. You have taken approximately " + breath + " breaths in your life. ");
            System.out.println("3. Your heart has beaten approximately " + beats + " beats in your life. ");
            System.out.println("4. Your daily lucky number is " + luckyNumber + " and you daily lucky sign is " + luckySign + ". ");

    }
}
