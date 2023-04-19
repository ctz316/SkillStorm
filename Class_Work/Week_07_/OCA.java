package SkillStorm.Class_Work.Week_07_;

import SkillStorm.Class_Work.Week_07_.beans.Sedan;
import SkillStorm.Class_Work.Week_07_.beans.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class OCA {

    public static void main(String[] args) {

        //multiDimensionalLists();
        mixedBuckets();


        enumTypes();

    }

    public static void enumTypes() {
        Sedan car1 = new Sedan(Vehicle.Color.ORANGE, "Toyota", "Camry");
        System.out.println(car1);
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////*****************   multiDimensionalLists   *******************************////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void multiDimensionalLists() {

        // ArrayLists usually better when needing Array. But not for multidimensional. Not very readable
        ArrayList<ArrayList<Integer>> myNums = new ArrayList<ArrayList<Integer>>();
        //System.out.println(myNums.get(9)); // Not sized so IndexOutOfBounds
        myNums.add(new ArrayList<Integer>());
        myNums.get(0).add(4);
        System.out.println(myNums);

        // Easier to read when doing multidimensional stuff
        int[][] myNums2 = new int[10][10];
        System.out.println(myNums2[9]);
        myNums2[4][3] = 7;
        myNums2[0][0] = 4;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////*****************   mixedBuckets   ****************************************////
    ///////////////////////////////////////////////////////////////////////////////////
        public static void mixedBuckets() {
        // Using a List over an array
        Map<String, ArrayList<Sedan>> nissanInventory = new HashMap<>();
        nissanInventory.put("Altima", new ArrayList<Sedan>());
        nissanInventory.put("Maxima", new ArrayList<Sedan>());

        System.out.println(nissanInventory);

        Sedan altima1 = new Sedan();
        Sedan altima2 = new Sedan("Red", "Nissan", "Altima");
        Sedan maxima1 = new Sedan("White", "Nissan", "Maxima");

        nissanInventory.get("Altima").add(altima1);
        nissanInventory.get("Altima").add(altima2);
        nissanInventory.get("Maxima").add(maxima1);

        // Lists are better for things that change in size often.
        // Arrays are better for things that do not change in size often.
        System.out.println(nissanInventory);

        ArrayList<Sedan> sentras = new ArrayList<>();
        sentras.add(new Sedan("Orange", "Nissan", "Sentra"));
        sentras.add(new Sedan("Red", "Nissan", "Sentra"));
        sentras.add(new Sedan("Brown", "Nissan", "Sentra"));
        sentras.add(new Sedan("Silver", "Nissan", "Sentra"));

        nissanInventory.put("Sentras", sentras);
        nissanInventory.get("Altima").add(new Sedan("Grey", "Nissan", "Altima"));
        nissanInventory.get("Altima").add(new Sedan("Tan", "Nissan", "Altima"));

        System.out.println(nissanInventory);
        System.out.println("***   Change model names   *********************************************************************************************************************************");
        System.out.println("Before name change: " + nissanInventory.get("Altima"));

        // update the model to be Altima v2
        for (Sedan nissan : nissanInventory.get("Altima")) {
            String name = nissan.getModel();
            name += " v2";

            nissan.setModel(name);
        }

        System.out.println("Name changed: " + nissanInventory.get("Altima"));
        System.out.println("***   Change color names   *********************************************************************************************************************************");

        System.out.println(nissanInventory);
        for (Map.Entry<String, ArrayList<Sedan>> entry : nissanInventory.entrySet()) {
            for (Sedan car : entry.getValue()) {
                String color = car.getColor();

                switch (color.toLowerCase()) {
                    case "blue":
                        car.setColor("Sea Stone");
                        break;
                    case "red":
                        car.setColor("Fiery Crimson");
                        break;
                    case "orange":
                        car.setColor("Deep Autumn");
                        break;
                    case "silver":
                        car.setColor("Pearl Egg Shell");
                        break;
                    case "grey":
                        car.setColor("Tropical Emerald");
                        break;
                    case "tan":
                        car.setColor("Obsidian");
                        break;
                }
            }
        }

            System.out.println(nissanInventory);
            System.out.println("***   ENUMS   *********************************************************************************************************************************");


    }
}
