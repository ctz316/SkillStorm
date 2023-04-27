package SkillStorm.Class_Work.Week_07_OCA_Interfaces.Interface;

public class PickUp implements Truck {

    public static void main(String[] args) {





        PickUp truck1 = new PickUp();
        truck1.tow("boat");  // This is being overridden by my override below.
        truck1.tow("Sedan", 4.5);

        // This is the class calling the static method we created.
        Truck.haul(5, "boat");

        // This does not work as it belongs to class now object
//        truck1.haul(5, "boat");

    }
    @Override
    public void tow(String payload) {
        System.out.println("Happy Happy days");
    }


}
