package SkillStorm.Class_Work.week_01_Setup.Variables.Math.Booleans;

public class Day_3_Math {

    public static void main(String[] args) {

        // Setting values to variables //
            int int1 = 7, int2 = 6;
            long long1 = 71L;
            long long2 = 7_000_000_000_000L; // Can use _ to separate numbers, and it will ignore the _.
            short short1 = 5;
            byte byte1 = 2;
            float float1 = 3.1416F;
            double double1 = 45.352;

        // Printing values of math problems //
            System.out.println(int1 + int2); // adding two integers
            System.out.println(long1 + int2);
            System.out.println(short1 + int1 + int2 + long1);
            System.out.println(int1 - int2); // subtracting two integers
            System.out.println(long1 - int2);
            System.out.println(short1 - int1 - int2 - long1);
            System.out.println(int1 * int2); // multiplying two integers
            System.out.println(int1 / int2); // dividing two integers // *** integers do not round and ignores decimal points ***
            System.out.println(float1 + double1); // adding two floats
            System.out.println(float1 - double1); // subtracting two floats
            System.out.println(float1 * double1); // multiplying two floats
            System.out.println(float1 / double1); // dividing two floats
            System.out.println(double1 * int1); // implicitly makes int1 a double

        // Saving results in a variable //
            int intResult = 0;

            intResult = int1 + int2 - short1;
            System.out.println(intResult);
            intResult = int1 + int2 - short1 / byte1;
                // 7 + 6 - 5 / 2 should be 10.5
                // 7 + 6 - 2
                // 13 - 2 = 11 Because integers always return an integer.
            System.out.println(intResult);

            intResult = int1 + int2 - short1 * int1 + short1 / byte1;
                // 7 + 6 - 5 * 7 / 5 +2 should be -19.5
                // 7 + 6 - 35 + 5 / 2
                // 7 + 6 - 35 + 2
                // 13 - 35 + 2
                // -22 + 2 = -20 Because integers always return an integer.
            System.out.println(intResult);

        // Casting //
            double doubleResult = 0;
                intResult = (int)((double)int1 + int2 - short1 * int1 + short1 / byte1); // explicit casting
                                        // or
                doubleResult = int1 + int2 - short1 * int1 + (double)short1 / byte1; // implicit casting  // needs new variable set to double to work
            System.out.println(intResult);
            System.out.println(doubleResult);

            short shortResult = 0;
                shortResult = (short)((double)int1 + int2 - short1 * int1 + short1 / byte1); // narrow casting // going from a double (larger) to a short (smaller)
            System.out.println(shortResult);

            double doubleResult1 = 0;
                doubleResult1 = int1 - int2 * short1 + float1 / double1 * byte1;
            System.out.println(doubleResult1);

            int val = 50000;
            byte val2 = (byte)val; // casting does not look at limits // *** This does not work ***
            System.out.println(val2);

        // Modulo // *** returns the remainder for division ***
            System.out.println(8 % 3); // returns 2
            System.out.println(13 % 4); // returns 1

    }

}
