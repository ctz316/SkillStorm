package Class_Work.week_01;

import java.util.Scanner;

public class Day_2_Variables_and_Scanner_Examples {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Primitive Variable Types and limits   *****************////
        ///////////////////////////////////////////////////////////////////////////////////

        //------------Integer------------//
            int favoriteNumber ; // un-initialized variable
            favoriteNumber = 7; // initialized variable
            System.out.println(favoriteNumber);

            int intNumber = 21;  // -2.1 Billion to 2.1 Billion (32 bits)
            intNumber = 31; // re-assignment
            System.out.println(intNumber);

        //------------byte------------//
            byte smallNumber = 120; // -128 to 127 (8 bits)
            System.out.println(smallNumber);

        //------------short------------//
            short shortNumber = 32767; // -32768 to 32767  (16 bits)
            System.out.println(shortNumber);

        //------------long------------//
            long longNumber = 2147483647L; // 9 quadrillion and change (64 bits)
            System.out.println(longNumber);

        //------------float------------//
            float floatNumber = 3.14f, floatNumber2 = 0.5f; // -2.1 Billion to 2.1 Billion (32 bits) Can have 2 variables defined on same line if same type.
            System.out.println(floatNumber);

            System.out.println(floatNumber + " " + floatNumber2); // writes both numbers is space between them.
            System.out.println(floatNumber + floatNumber2); // adds both numbers.

        //------------double------------//
            double doubleNumber = 1.7976931348623157E308; // 9 quadrillion and change (64 bits)  will tack on . at end if not placed
            System.out.println(doubleNumber);

        //------------character------------//
            char charASCII = '!'; // ASCII table (16 bits) (literal using '')
            char charASCII_2 = 33; // decimal point on ASCII table
            System.out.println(charASCII);
            System.out.println(charASCII_2);

        //------------boolean------------//
            boolean booleanNumber = true; // true to false (1 bit)
            System.out.println(booleanNumber);

        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Non-Primitive Variable Types and limits   ****************////
        ///////////////////////////////////////////////////////////////////////////////////

            //------------String------------//
            String name = "Kid Barker";
            System.out.println(name);

        ///////////////////////////////////////////////////////////////////////////////////
        ////****************************   Manipulation   *****************************////
        ///////////////////////////////////////////////////////////////////////////////////

            System.out.println("What is you name? ");
            Scanner in = new Scanner(System.in);
            String inputName1 = in.nextLine();
            System.out.println("Hello "  + inputName1 + "!");

            System.out.println("How old are you? ");
            int inputName2 = in.nextInt();
            System.out.println(inputName1 + ", " + "Your age is: " + inputName2 + "!");

        in.close(); // *****   close scanner when done with it.   *****

    }
}
