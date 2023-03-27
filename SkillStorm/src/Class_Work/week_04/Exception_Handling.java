package Class_Work.week_04;

import Class_Work.week_04.Abstract.Sport;

public class Exception_Handling {

    public static void main(String[] args) {

        //ExampleOfErrors();
        //ExampleOfErrors_2();
        //Errors_3();
        //Errors_4(); // String multiple Exceptions
        Errors_5(); // Catch All Exception

    }

    public static void ExampleOfErrors() {
        System.out.println("   ***   Error 1   ***");
        try {
            int var = 0;
            System.out.println(5 / var); // Code stopped working here
            System.out.println("Math worked"); // Didn't run
        } catch(ArithmeticException ex) {
            System.out.println("Someone mathed wrong"); // Helped Java to keep running
        }
        System.out.println("Method finished"); // Showed me that the rest of the code ran successfully.
    }

    public static void ExampleOfErrors_2() {
        System.out.println("   ***   Error 2   ***");
        try {
            int var = 5;
            System.out.println(5 / var);
            System.out.println("Math worked");
        } catch(ArithmeticException ex) {
            System.out.println("Someone mathed wrong"); // Did not run because the above code was fixed
        }
        System.out.println("Method finished");
    }

    public static void Errors_3() {
        System.out.println("   ***   Error 3   ***");
        try {
            int[] nums = { 2, 4, 6, 1};
            nums[5] = 7;
            System.out.println("Array worked");
        } catch(ArrayIndexOutOfBoundsException ex) { // To fix Array out of bounds Exception
            System.out.println("Someone goofed up");
        }
        System.out.println("Method finished");
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////*****************   String Exceptions   ***********************************////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void Errors_4() { // Stringing Catches
        System.out.println("   ***   Error 4   ***");
        try {
            int val = 0;
            int[] vals = {1, 2};
            Sport obj = null;

            int result = 3 / vals[3];
                System.out.println("Array worked");

        }   catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException ex) { // Multiple Exceptions
                System.out.println("Someone goofed up");
        }
        System.out.println("Method finished");
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////*****************   Catch All   *******************************************////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void Errors_5() { // Catch all catch but can not give specific instructions on how to fix and get usable results
        System.out.println("   ***   Error 5   ***");
        try {
            int val = 0;
            int[] vals = {1, 2};
            Sport obj = null;

            int result = 3 / vals[3];
            System.out.println("Array worked");

        }   catch(Exception ex) {  // Catch All
            System.out.println("Someone goofed up");
        }
        System.out.println("Method finished");
    }



}
