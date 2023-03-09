package Class_Work.week_02;

public class Day_4_Loops {

    public static void main(String[] args) {

        ////***   Simple loop   *******************************************************////
            // simpleLoopSection();

        ////***   Overflow loop example   *********************************************////
            // infiniteLoopSection();

        ////***   increment / decrement   *********************************************////
            // incrementSection()

        ////***   loop Thru Array   ***************************************************////
            // loopThruArraySection();

        ////***  Looping Strings     **************************************************////
            // loopStringsSection();

        ////***   Looping Strings with Break   ****************************************////
            // loopStringsWithBreakSection

        ////***   loop Strings With Continue   ****************************************////
            // loopStringsWithContinueSection();

        ////***   Post Fix Operator   *************************************************////
            // postFixOperatorSection();

        ////***   Pre Fix Operator   *************************************************////
            preFixOperatorSection();
    }

    public static String[] cookieSetUp() {
        // Setting up array to use in examples
        String[] cookies = {"Chocolate Chip",
                            "Oatmeal",
                            "Sugar",
                            "Snickerdoodle",
                            "M&M",
                            "No-Bake",
                            "Peanut Butter"
        };
        return cookies;
    }


    public static void simpleLoopSection() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Simple loop   ********************************************////
        ///////////////////////////////////////////////////////////////////////////////////

        // Setting up variable
        int count = 0;

        // Setting up loop
        while (count < 3) {
            System.out.println(count);
            count = count + 1;
        }

        // What to do after loop
        System.out.println("Final count: " + count); // Shows that 3 was included but not displayed
        System.out.println("Outside the loop!");
    }

    public static void infiniteLoopSection() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Overflow loop example   **********************************////
        ///////////////////////////////////////////////////////////////////////////////////

        // Setting up new variable
        int count = 1;

        // Setting up new loop
        while (count > 0) {
            System.out.println(count); // Showing that it will stop when it exceeds primitive data size (Integer Overflow)
            count = count + 100;
        }
        // What to do after loop ends
        System.out.println("Outside the loop");
    }

    public static void incrementSection() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   increment / decrement   **********************************////
        ///////////////////////////////////////////////////////////////////////////////////

        // Increments -- works with -=, /=, *=, %=   -- (variable = variable <operation> <equation>)
        System.out.println("Increments");
        int count = 0;

        System.out.println(count);
        count = count + 1;
        System.out.println(count);
        count += 1;
        System.out.println(count);

        // Does counts by 1
        System.out.println("Increments - shorthand");
        count = 0;

        // Adding
        count++; // post-fix increment
        System.out.println(count);
        ++count; // pre-fix increment
        System.out.println(count);
        // Subtracting
        count--; // post-fix increment
        System.out.println(count);
        --count; // pre-fix increment
        System.out.println(count);
    }

    public static void loopThruArraySection() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////********************   loop Thru Array   **********************************////
        ///////////////////////////////////////////////////////////////////////////////////

        int[] nums = {23, 7, 13, 4, 15, 67, 42, 72, 45, 81};
        int i = 0;

        while (i < nums.length) {
            System.out.println(nums[i]);
            i++;
        }

    }

    public static void loopStringsSection() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////********************  Loop Strings    **********************************////
        ///////////////////////////////////////////////////////////////////////////////////

        String[] myCookies = cookieSetUp();

        int i = 0;

        while (i < myCookies.length) {
            String temp = myCookies[i].concat(" cookie");
            System.out.println(temp);
            i += 1;
        }
    }


    public static void loopStringsWithBreakSection() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////********************  Loop Strings With Breaks    *************************////
        ///////////////////////////////////////////////////////////////////////////////////

        String[] myCookies = cookieSetUp();

        int i = 0;

        while (i < myCookies.length) {
                if (myCookies[i].equals("Peanut Butter")) {
                    break;
                }
                String temp = myCookies[i].concat(" cookie");
                System.out.println(temp);
                i += 1;
            }

    }

    public static void loopStringsWithContinueSection() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////********************  Loop Strings With Breaks    *************************////
        ///////////////////////////////////////////////////////////////////////////////////

        String[] myCookies = cookieSetUp();

        int i = 0;

        System.out.println("Yesterday I ate a: ");
            while (i < myCookies.length) {
                if (myCookies[i].length() > 8) {
                    i += 1;
                    continue;
                }
                String temp = myCookies[i].concat(" cookie");
                System.out.println(temp);
                i += 1;
            }

    }

    public static void postFixOperatorSection() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////********************  Post Fix Operator    ********************************////
        ///////////////////////////////////////////////////////////////////////////////////

        // Set Variable
            int myNumber = 0;

        // See where variable is at
            System.out.println(myNumber);

        // showing variable + 1
            myNumber++;
            System.out.println(myNumber);

        //variable is printed and THEN the 1 is added
            System.out.println("1. " + myNumber++);
            System.out.println("2. " + myNumber++);

        // Looping
            int[] myArray = { 10, 11, 12, 13, 14, 15};

            myNumber = 0;
            while (myNumber < myArray.length) {
                // This increments myNumber everytime it runs
                //. increments it *** AFTER *** it checks the value
                System.out.println(myArray[myNumber++]);
            }

    }

    public static void preFixOperatorSection() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////********************  Pre Fix Operator    *********************************////
        ///////////////////////////////////////////////////////////////////////////////////

        // Set Variable
        int myNumber = 0;

        // See where variable is at
        System.out.println(myNumber);

        // showing variable + 1
        ++myNumber;
        System.out.println(myNumber);

        //variable is printed and THEN the 1 is added
        System.out.println("1. " + ++myNumber);
        System.out.println("2. " + ++myNumber);

        // Looping
        int[] myArray = {10, 11, 12, 13, 14, 15};

        myNumber = 0;
        while (myNumber < myArray.length) {
            // This increments myNumber everytime it runs
            //. increments it *** BEFORE *** it checks the value
            System.out.println(myArray[++myNumber]); // Tries to add an extra position to the array.
        }

        //  Can change and be used. Use other method unless this one is needed for some reason.
//            myNumber = -1;
//            while (myNumber < myArray.length - 1) {
//                // This increments myNumber everytime it runs
//                //. increments it *** BEFORE *** it checks the value
//                System.out.println(myArray[++myNumber]); // Tries to add an extra position to the array.
//            }


    }
}
