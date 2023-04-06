package Class_Work.week_02_Methods.Arrays.Loops;

import java.util.Scanner;

public class Day_3_Arrays {
    public static void main (String[] args) {


    // Setting up literal array //
    System.out.println("--- Section 1 ---");
    int[] myNumbers123 = { 1, 2, 3, 4, 5 }; // Arrays start with position 0
        int a = myNumbers123[0] ;
            System.out.println(a);
        int b = myNumbers123[2] ;
            System.out.println(b);
        int c = myNumbers123[4] ;
            System.out.println(c);


    // Change info stored in array with position number //
    System.out.println("--- Section 2 ---");
        myNumbers123[0] = 10;
            System.out.println(myNumbers123[0]);
        myNumbers123[1] = 11;
            System.out.println(myNumbers123[1]);
        myNumbers123[4] = 12;
            System.out.println(myNumbers123[4]);


    // to find length of array //
    System.out.println("--- Section 3 ---");
        int size = myNumbers123.length;
            System.out.println(size - 1);


    // Making Arrays for class //
    System.out.println("--- Section 4 ---");
        // Creating array with values
            String[] cookies = { "Chocolate Chip", "Oatmeal", "Sugar", "Snickerdoodle"}; // all items need to be same datatype
        // printing location in memory and also length
            System.out.println(cookies); // cannot print items this way. This gives memory location.
            System.out.println(cookies.length);
        // Showing array info
            System.out.println(cookies[0]);
            System.out.println(cookies[1]);
            System.out.println(cookies[2]);
            System.out.println(cookies[3]);


    // Making Arrays for class # 2 //
    System.out.println("--- Section 5 ---");
        // creating array without values
            String[] GIJoes = new String[5];
            System.out.println(GIJoes[0]); // no value, default null

        // Entering info to array
            GIJoes[0] = "Duke";
            GIJoes[1] = "Doc";
            GIJoes[2] = "Snake Eyes";
            GIJoes[3] = "Dusty";
            GIJoes[4] = "Gung-Ho";

        // Printing array
            System.out.println(GIJoes[0]);
            System.out.println(GIJoes[1]);
            System.out.println(GIJoes[2]);
            System.out.println(GIJoes[3]);
            System.out.println(GIJoes[4]);

    // Create array #3 //
    System.out.println("--- Section 6 ---");
        // declaring an array
            int[] nums;
        // entering values
            nums = new int[] { 23, 7, 13, 4, 15, 67, 42, 72, 45, 81 };

        // .length has no () because it's a property, not a method
            System.out.println(GIJoes.length);

    // Create array #4 //
    System.out.println("--- Section 7 ---");
        // Setting and getting length
            String name = "Kid Barker";
            System.out.println(name.length());

        // using String to input into Array
            char[] name2 = name.toCharArray();
            System.out.println(name2[0]);
            System.out.println(name2[1]);
            System.out.println(name2[2]);
            System.out.println(name2[3]);
            System.out.println(name2[4]);

        // using Array to create String
            String fullName = new String(name2);
            System.out.println(fullName);
            
//        // Calling getGarageSpace
//            String[] Cookies = getGarageSpace();
//            System.out.println(Cookies.length);

        // Calling count3
            System.out.println("First 3 = " + count3(nums));

        // Seeing how changing 1 array that has another pointing to it, changes bot as they are looking at same memory spot, Unlike section 1
            System.out.println("--- Section 10 ---");

            int[] numArray1 = { 1, 2, 3};
            int[] numArray2 = numArray1;

            System.out.println("numArray1");
            System.out.println(numArray1[0]);
            System.out.println(numArray1[1]);
            System.out.println(numArray1[2]);

            System.out.println("numArray2");
            System.out.println(numArray2[0]);
            System.out.println(numArray2[1]);
            System.out.println(numArray2[2]);

        // Finding the location that it's looking at
            System.out.println(numArray1);
            System.out.println(numArray2);

            numArray1[1] = 5;
        // Actually changes both, they are looking at the same memory location
            System.out.println("numArray1");
            System.out.println(numArray1[0]);
            System.out.println(numArray1[1]);
            System.out.println(numArray1[2]);

            System.out.println("numArray2");
            System.out.println(numArray2[0]);
            System.out.println(numArray2[1]);
            System.out.println(numArray2[2]);

        // changing where numArray1 is located in memory
            numArray1 = new int[3];

            System.out.println("numArray1");
            System.out.println(numArray1[0]);
            System.out.println(numArray1[1]);
            System.out.println(numArray1[2]);

            System.out.println(numArray1);
            System.out.println(numArray2);

        // Clone make s separate image of the array in another location of memory
            numArray1 = numArray2.clone();
            System.out.println("numArray1 * Clone 1 ");
            System.out.println(numArray1[0]);
            System.out.println(numArray1[1]);
            System.out.println(numArray1[2]);

            System.out.println("numArray2 * Clone 1 ");
            System.out.println(numArray2[0]);
            System.out.println(numArray2[1]);
            System.out.println(numArray2[2]);

            System.out.println(numArray1);
            System.out.println(numArray2);

            numArray2[0] = 7;

            System.out.println("numArray1 * Clone 2 ");
            System.out.println(numArray1[0]);
            System.out.println(numArray1[1]);
            System.out.println(numArray1[2]);

            System.out.println("numArray2 * Clone 2 ");
            System.out.println(numArray2[0]);
            System.out.println(numArray2[1]);
            System.out.println(numArray2[2]);

            System.out.println(numArray1);
            System.out.println(numArray2);
    }

//    public static String[] getGarageSpace() {
//        // Creating an array that gets values from user input //
//        System.out.println("--- Section 8 ---");
//
//            String[] garage; // Declared but not initialized
//            Scanner in = new Scanner(System.in);
//
//            System.out.println("How many cars do you have? ");
//            int current = in.nextInt(); // Read in the number of cars
//            in.nextLine(); // Clears buffer
//
//            System.out.println("How many cars do you want? ");
//            int desired = in.nextInt(); // Read in the number of cars
//            in.nextLine(); // Clears buffer
//            in.close(); // Stop Scanner
//
//        // Just funny
//            System.out.println("Searching..............................");
//            System.out.println("You're in luck! I've got just the right thing for you!");
//
//        // Using user info to create Array
//            garage = new String[desired];
//
//        // Methods require RETURN statement
//            return garage;
//    }

    public static int count3(int[] nums) {
    System.out.println("--- Section 9 ---");

        int result = 0;
        result = result + nums[0]; // 0 + 23 = 23
        result = result + nums[1]; // 23 + 7 = 30
        result = result + nums[2]; // 30 + 17 = 47  -- Just keeps adding to the last result

        return result;
    }
}
