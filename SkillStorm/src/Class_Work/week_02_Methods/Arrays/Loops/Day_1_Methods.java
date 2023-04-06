package Class_Work.week_02_Methods.Arrays.Loops;

public class Day_1_Methods {

        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Notes   **************************************************////
        ///////////////////////////////////////////////////////////////////////////////////
    //         What is a Method? A set of instructions  -- that can be used to manipulate data.
    //                                                  -- Block of code to perform some operation                                       --
    //                                                  -- Only runs when called
    //                                                  -- Defines behavior of class
    //                                                  -- Must be defined inside class
    //
    //         Declaring a Method has 6 parts
    //                                                   -- Name --       -- Example --
    //                                                   1) Accessor      - "public"
    //                                                   2) Modifier      - "static"
    //                                                   3) Return type   - "void"
    //                                                   4) Name          - "WHAT EVER YOU NAME IT"
    //                                                   5) Parameters    - "(  )"
    //                                                   6) Body          - "{  }"
    //
    //          Method Signature -- Consists of method NAME and PARAMETERS.
    //
    //          PARAMETERS are coder defined within the method. ARGUMENTS are input from external source from method you are currently working in.

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   Method 1   ***********************************************////
    ///////////////////////////////////////////////////////////////////////////////////
        public static void main(String[] args) {

            // this is a method
            // this method is the entry point for every application
            // methods exist inside a class
            System.out.println("We're calling methods today.");
            System.out.println("This is a method, this is the print method.");

            Junkprint("Not the tabs!");
            Junkprint("Test 2!");
            printNumbers(26.5, 12);


            System.out.println(numComparison(5.2, 3.2));
        }

        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Method 2   ***********************************************////
        ///////////////////////////////////////////////////////////////////////////////////
        // The order of defining/declaring these do not matter.
        public static void Junkprint (String whatItSays){
            System.out.println(whatItSays + " Continuation");
        }

        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Method 3   ***********************************************////
        ///////////////////////////////////////////////////////////////////////////////////
        public static void printNumbers ( double x, int y){
            System.out.println(x + y);
        }

        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Method Math Problem   ************************************////
        ///////////////////////////////////////////////////////////////////////////////////

        public static String numComparison ( Double num1, Double num2) {
            if (num1 == num2) {
                return num1 + " is equal to " + num2;
            }
                else if (num1 > num2) {
                    return num1 + " is greater than " + num2;
                }
                else {
                    return num1 + " is less than " + num2;
                }

        }


}

