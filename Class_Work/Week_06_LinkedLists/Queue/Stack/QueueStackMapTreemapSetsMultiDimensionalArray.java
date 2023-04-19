package SkillStorm.Class_Work.Week_06_LinkedLists.Queue.Stack;

import SkillStorm.Class_Work.Week_06_LinkedLists.Generics.Sedan;

import java.util.*;


public class QueueStackMapTreemapSetsMultiDimensionalArray {

    public static void main(String[] args) {
        //_1_DequeStructures();
        //_2_moreDequeStructures2();
        //_3_queue();
        //_4_map();
        //_5_TreeMap();
        //_6_Sets();
        //_7_multiDimensionalArrays();
        _8_JaggedArrays();


    }

    public static void _1_DequeStructures() {
        Deque<String> stack = new LinkedList<>(); // Last in, First out

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack);

        System.out.println(stack.peek() + " <~~~ Peek command, Shows last in");
        System.out.println(stack.pop() + " <~~~ Pop command, shows and removes the last in");
        System.out.println(stack);

        String lastElement = stack.pop();
        System.out.println(lastElement + " <~~~ Last Element is variable to remove last in");
        System.out.println(stack);
    }

    public static void _2_moreDequeStructures2() {
        Deque<String> stack = new LinkedList<>(); // Last in, First out

        stack.push("Mike");
        stack.push("Bob");
        stack.push("Tim");
        stack.push("Fran");
        stack.push("Sam");
        stack.push("Tyron");
        System.out.println(stack);

        while(stack.peek() != null) {
            int place = stack.size() ;
            String name = stack.pop();
            System.out.println(place + ". " + name + " <~~~~ This removes everything while showing you what it got rid of");
        }

        stack.push("You");
        stack.push("make");
        stack.push("my");
        stack.push("heart");
        stack.push("ache");
        System.out.println(stack);

        while(stack.size() != 0) {
            int place = stack.size() ;
            String name = stack.pop();
            System.out.println(place + ". " + name + " <~~~~ This removes everything while showing you what it got rid of");
        }
        System.out.println(stack);
    }

    public static void _3_queue() {
        Queue<String> line = new LinkedList<>(); // First in, First out (FIFO)

        line.offer("Dan");
        line.offer("John");
        line.offer("Miles");
        line.offer("Patrick");
        line.offer("Kid");

        System.out.println(line);
        System.out.println(line.peek() + " <~~~ Peek is same as for Deque");

        while(line.size() != 0) {
            int place = line.size() ;
            String name = line.poll();
            System.out.println(place + ". " + name + " <~~~~ This removes everything while showing you what it got rid of");
        }
        System.out.println(line);
    }

    public static void _4_HashMap() {

//TODO Get hashcode
//        @Override
//        public int hashCode() {
//            return Objects.has(getMake(), getModel());
//        }

        Map<String, String> birthdays = new HashMap<>(); // Interface just like List, Queue, and Dequeue // Maps are a data structure that function off key-value pairs

        birthdays.put("Kid", "10/10/1776"); // my key is name and value is the birthdate
        birthdays.put("Haven", "01/20/1998");
        birthdays.put("Asa", "03/31/2016");

        System.out.println(birthdays + " <~~~ sorts/finds your keys based on hashcode");

        System.out.println(birthdays.get("Asa") + " <~~~ search hashmap by key");

        for (Map.Entry<String, String> entry : birthdays.entrySet()) {
            System.out.printf("Key: %s, Value: %s%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Printing the complete hashmap entry's 1 by 1");

        System.out.println(birthdays.get("Patrick" + " <~~~~~ Not in hashmap so prints null"));

        System.out.println(birthdays.size());

        birthdays.replace("Kid", "01/30/1976");
        System.out.println(birthdays.get("Kid") + " <~~~ Replaced values of Kid's birthday");

        birthdays.put("Tid", "05/16/1984");
        System.out.println(birthdays.get("Tid") + " <~~~ Wrong entry of key");
        birthdays.remove("Tid");
        System.out.println(birthdays + " <~~~ Can change value but not key");

        birthdays.put("Kid", "05/16/1984");
        System.out.println(birthdays + " <~~~ Overwrites what is there when duplicate keys entered.");

        Map<Sedan, Integer> inventory = new HashMap<>();
        Sedan car1 = new Sedan();
        Sedan car2 = new Sedan();
        Sedan car3 = new Sedan("Black", "Toyota", "Corolla");
        Sedan car4 = new Sedan("Red", "Honda", "Civic");

        inventory.put(car1, 1); // Nissan Altima
        inventory.put(car3, 1); // Toyota Corolla
        inventory.put(car4, 1); // Honda Civic

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(new Sedan()));
        System.out.println(car1.hashCode() + " <~~~ car1 hashcode");
        System.out.println(car2.hashCode() + " <~~~ car2 hashcode");

        inventory.put(car2, 2); // Update to make Altima's equal 2
        System.out.println(inventory);
    }

    public static void _5_TreeMap() {

        Map<String, String> sbirthdays = new TreeMap<>();
        sbirthdays.put("Kid", "10/10/1776"); // my key is name and value is the birthdate
        sbirthdays.put("Haven", "01/20/1998");
        sbirthdays.put("Asa", "03/31/2016");

        System.out.println(sbirthdays + " <~~~ Sorts by compareTo() or default is alphabetically");


    }

    public static void _6_Sets() { // Does Not allow duplicates or indexed searches
        Set<String> names = new HashSet<>();
        names.add("Kid");
        names.add("Dan");
        names.add("Jason");
        names.add("Patrick");
        names.add("Miles");
        names.add("Patrick"); // ignores this one

        System.out.println(names);
        System.out.println("   ***   Nice way to see the list   ***");
        for (String name : names) {
            System.out.println(name);
        }

        // Iterator, (java.util) a special class that represents an unchanging set of values that I can loop over
        System.out.println("   ***   Both the same, ordered by hashcode   ***");
        Iterator<String> hashSetIterator = names.iterator();
        while (hashSetIterator.hasNext()) {
            String name = hashSetIterator.next();
            System.out.println(name);
        }

        System.out.println("   ***   Sorted alphabetically , can use comparable and comparator   ***");
        Set<String> sNames = new TreeSet<>();
            sNames.add("Kid");
            sNames.add("Dan");
            sNames.add("Jason");
            sNames.add("Patrick");
            sNames.add("Miles");
            sNames.add("Patrick"); // ignores this one
        System.out.println(sNames);

        Sedan Car1 = new Sedan();
        Sedan Car2 = new Sedan();
        Sedan Car3 = new Sedan("Black", "Toyota", "Corolla");
        Sedan Car4 = new Sedan("Red", "Honda", "Civic");

        Set<Sedan> sInventory = new TreeSet<>();
        System.out.println("   ***   Inventory with Comparable   ***");
        sInventory.add(Car1);
        sInventory.add(Car2);
        sInventory.add(Car3);
        sInventory.add(Car4);
        System.out.println(sInventory);

        System.out.println("   ***   Inventory with comparator   ***");
        Sedan.SedanColorComparator2 comparator = new Sedan.SedanColorComparator2();
        Set<Sedan> cInventory = new TreeSet<>(comparator);
        cInventory.add(Car1);
        cInventory.add(Car2);
        cInventory.add(Car3);
        cInventory.add(Car4);
        System.out.println(cInventory);
    }

    public static void _7_multiDimensionalArrays() {
        int[] lap1 = new int[5]; // normal array
        int[] lap2 = new int[5];

        // Makes a 2 column array
        int[][] laps = new int[2][5];
//        [ 7, 0, 6, 0, 0 ] ~ Array 0
//        [ 0, 8, 0, 0, 4 ] ~ Array 1

        lap1[2] = 6; // Normal array value change
        laps[0][2] = 6; // change value in multiArray

        lap2[1] = 8;
        laps[1][1] = 8;

        lap1[0] = 7;
        laps[0][0] = 7;

        lap2[4] = 4;
        laps[1][4] = 4;

        System.out.println("   ***   Printing normal arrays   ***");

        for (int i = 0; i < lap1.length; i++) {
            System.out.print("[ ");
            System.out.print(lap1[i] + ", ");
            System.out.println(" ]");
            System.out.print("[ ");
            for (int j = 0; j < lap1.length; j++) {
                System.out.print(lap2[j] + ", ");
            }
            System.out.println("]\n");
        }
        System.out.println("\n   ***   Printing multiArrays arrays   ***");
        for (int x = 0; x < laps.length; x++) {
            System.out.print("[ ");
            for (int y = 0; y < laps[0].length; y++) {
                System.out.print(laps[x][y] + " ");
            }
            System.out.println("]");
        }
    }

    public static void _8_JaggedArrays() {
        int [][] jaggedNums = new int[4][];
        // []
        // []
        // []
        // []
        jaggedNums[0] = new int[3];
        jaggedNums[1] = new int[5];
        jaggedNums[2] = new int[8];
        jaggedNums[3] = new int[4];
        // [] [] []
        // [] [] [] [] []
        // [] [] [] [] [] [] [] []
        // [] [] [] []

        // Now insert values
        // [1] [2] [3]
        // [4] [5] [6] [7] [8]
        // [9] [10] [11] [12] [13] [14] [15] [16]
        // [17] [18] [19] [20]
        int count = 1;
        for (int row = 0; row < jaggedNums.length; row++) {
            for (int column = 0; column < jaggedNums[row].length; column++) {
                jaggedNums[row][column] = count;
                count++;
            }
        }

        // Printing jaggedArray
        for (int row2 = 0; row2 < jaggedNums.length; row2++) {
            System.out.print("[ ");
            for (int column2 = 0; column2 < jaggedNums[row2].length; column2++) {
                System.out.print(jaggedNums[row2][column2] + " ");
            }
            System.out.println("]");
            }
    }
}

