package SkillStorm.Class_Work.Week_07_OCA_Interfaces.Interface;

public interface Truck {

    // Can use the DEFAULT keyword to provide a default implementation for a method.
    // Allows you to define functionality in an interface.





    //These belong to instance. DEFAULT keyword is the ONLY way to make these. and they can be Overridden.
    public default void tow(String payLoad) {
        System.out.println("Towed a " + payLoad + ".");
    }

    public default void tow(String payLoad, double distance) {
        System.out.println("Towed a " + payLoad + " for " + distance + " " + "miles.");
    }



    // These belong to the CLASS
    public static void haul(int amt, String payload) {
        System.out.println("Hauled " + amt + " " + payload + "s.");
    }
}
