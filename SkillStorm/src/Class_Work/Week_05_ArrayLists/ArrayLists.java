package Class_Work.Week_05_ArrayLists;

import Class_Work.Week_05_ArrayLists.Beans.Sedan;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public static void main(String[] args) {

//        arrayList();
        moreArrayLists();
//        shortCircuiting();
//        ternaryOperator();
    }


    public static <List> void arrayList() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Arrays Lists Setup   **********************************////
        ///////////////////////////////////////////////////////////////////////////////////
            ArrayList<String> names = new ArrayList<String>(); // Just adds to the end of the list, variable size.
                names.add("Dan Pickels");
                names.add("Kid Barker");
                names.add("Bruce Wayne");
                names.add("Clark Kent");
                names.add(String.valueOf(5));

            String[] names2 = new String[3]; // Rigidly sized to what you say. No more, no less.
                names2[0] = "Dan Pickles";
                names2[1] = "Kid Barker";
                names2[2] = "Bruce Wayne";
    //            names2[3] = "Clark Kent"; // out of bounds
                    String[] temp = new String[4];

            System.out.println(names2); // Prints memory location
            System.out.println(names); // Prints contents
            System.out.println(names2.length); // What size if used or not
            System.out.println(names.size()); // only what is currently used

        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Arrays Lists pull info   ******************************////
        ///////////////////////////////////////////////////////////////////////////////////
            System.out.println(names2[1]);
            System.out.println(names.get(1));

        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Remove Arrays Lists   *********************************////
        ///////////////////////////////////////////////////////////////////////////////////

            names.remove(2);
            // or
            names.remove("Kid Barker"); // Only removes first occurrence of item
            // or
            names.remove(new Integer (5)); // for numbers

            // creating a new arraylist of doubles
            ArrayList<Double> doubles = new ArrayList<>();
            doubles.add(4.5);
            doubles.add(7.5);
            doubles.add(62.352);
            doubles.add(3.0);

            // changing a value
            System.out.println("changing a value");
            doubles.add(2, 84.3); // Adds in a certain spot, in this case index 2 and moves the others down

            System.out.println(doubles);

            // Check if something is in an arraylist
            System.out.println("Check if something is in an arraylist");
            System.out.println(doubles.contains(3)); // returns boolean
            System.out.println(doubles.get(1));
            System.out.println(doubles.set(1, 73.813)); // set returns the value it changed

            System.out.println("");

    }

    public static <List> void moreArrayLists() {
        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Sorting and converting arraylists   *******************////
        ///////////////////////////////////////////////////////////////////////////////////

        Sedan[] carArray = new Sedan[] {new Sedan(), new Sedan("Black", "Misubishi", "Evo"),
        new Sedan("red", "Mazda", "RX8"), new Sedan("Silver", "Nissan", "Skyline")};

        ArrayList<Sedan> cars = new ArrayList<>(Arrays.asList(carArray)); // make array to arraylist
        System.out.println("***   Car Arrays   ***");
        System.out.println(cars);

//        cars.toArray(); // make array list go to array

        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Comparator   ******************************************////
        ///////////////////////////////////////////////////////////////////////////////////
//        Sedan.SedanColorComparator2 comparator = new Sedan.SedanColorComparator2();
//        cars.sort(comparator);
//        System.out.println(cars);

//        Collections.sort(cars);
//        System.out.println(cars);
    }

    public static void shortCircuiting() {

        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Short Circuiting   ************************************////
        ///////////////////////////////////////////////////////////////////////////////////

        Sedan cyclone = null;
        int variable = 3;
        System.out.println(variable == 3 || cyclone.getMake().equals("Cyclone")); // Didn't look at cyclone, this is
                                                                                    // called short-circuiting
        System.out.println(cyclone.getMake().equals("Cyclone") || variable == 3 ); // Errors out

        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Bitwise   *********************************************////
        ///////////////////////////////////////////////////////////////////////////////////

        // Bitwise does not short-circuit
        System.out.println(variable == 3 || cyclone.getMake().equals("Cyclone"));
//        System.out.println(variable == 3 | cyclone.getMake().equals("Cyclone")); // <~~~ bitwise OR
//        System.out.println(variable == 3 && cyclone.getMake().equals("Cyclone"));
//        System.out.println(variable == 3 & cyclone.getMake().equals("Cyclone")); // <~~~ bitwise AND
    }

    public static void ternaryOperator() {

        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Ternary   *********************************************////
        ///////////////////////////////////////////////////////////////////////////////////

        int val;
        int condition = 6;

        // regular
        if(condition % 2 == 0) {
            val = 2;
        }else {
            val = 3;
        }
        System.out.println(val);

        val = 0;

        // Ternary #1
        switch (condition % 2) {
            case 0:
                val = 4;
                break;
            default:
                val = 6;
                break;
        }
        System.out.println(val);

        // Ternary #2
        val = condition % 2 == 0 ? 8 : 12;
        System.out.println(val);
        // condition (needs to be boolean)
        // if true do right after ?
        // if false do after the :
    }

}
