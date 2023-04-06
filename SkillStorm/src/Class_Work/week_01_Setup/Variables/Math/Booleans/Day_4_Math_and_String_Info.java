package Class_Work.week_01_Setup.Variables.Math.Booleans;

public class Day_4_Math_and_String_Info {

        public static void main(String[] args) {

            // power is for exponents //
                System.out.println(Math.pow(2, 3));

                System.out.println(Math.pow(2.5, 3)); // Math.pow returns double numbers

            // Setting variables to play with //
                double result, double1 = 7.7, double2 = 10.9, double3 = 3.2;
                int int1 =7, int2 = 3, int3 = 4;

            // Using Math.pow //
                result = Math.pow(int3, 3) + int2 * Math.pow(double2 / int2, 2) - int1 * double2; // (4^3) + 3 * ((109 /3)^2) - 7 * 10.9
                System.out.println(result);

                result = Math.pow(Math.pow(int3, 3) + int2 * Math.pow(double2 / int2, 2) - int1 * double2, 2); // (4^3) + 3 * ((109 /3)^2) - 7 * 10.9
                System.out.println(result);

                result = double1 - double3 * Math.pow(int1, int3) / int2 + double3;
                System.out.println(result);


            // square root //
                System.out.println(Math.sqrt(4));

                result = Math.pow(int3, 3) + int2 * Math.sqrt(Math.pow(double2 / int2, 2)) - int1 * double2 ;
                System.out.println(result);

                result = Math.sqrt(double2 * int3 + double1) * Math.pow(int2, double3 + int1) - double1 / (double2 * int1);
                System.out.println(result);


             // ceil and floor //
                System.out.println(Math.ceil(2.4));  // always rounds up
                System.out.println(Math.floor(2.4)); // always rounds down


             // String //  *** Strings always have "" ***   *** Strings are an object not a primitive ***
                String fName = "Kid";
                String lName = "Barker";
                String fullName = fName + " " + lName;
                System.out.println(fName + " " + lName);


             // Upper and lower case //
                System.out.println(fName.toUpperCase());
                System.out.println(fName.toLowerCase());

                System.out.println(lName.toUpperCase());
                System.out.println(lName.toLowerCase());


             // Getting Length of String //
                System.out.println(fName.length()); // length is a method of String class
                System.out.println(lName.length());


             // Sub-String //
                System.out.println(fullName.substring(1, 4)); // substring shows the characters from index 1 to index 4
                System.out.println(fullName.substring(3, 9));
                System.out.println(fullName.substring(0, 3));

                System.out.println(fullName.substring(0)); // both show the full length of the string from the position indicated by 0
                System.out.println(fullName.substring(0, fullName.length()));


             // == equality comparison //
                String name1 = "Dan Pickles";
                String name2 = "Dan Pickles";

                System.out.println(name1 == name2); // Does not always work for string comparisons, Just checks for location in memory.
                System.out.println(name1.equals(name2)); // Preferred method of String class, This actually looks at the value of each character in the string.

                System.out.println(new String("Dan Pickles") == "Dan Pickles"); // false
                System.out.println(new String("Dan Pickles").equals ("Dan Pickles")); // true
                System.out.println(new String("Dan Pickles") == new String (("Dan Pickles"))); // false
                System.out.println(new String("Dan Pickles").equals (new String (("Dan Pickles")))); // true

                String lastName = "BaRkEr";
                System.out.println(lastName.equals(lName)); // false
                System.out.println(lastName.equalsIgnoreCase(lName)); // true

    }

}
