package SkillStorm.Class_Work.week_10_ThreadsCont.Singleton;

public class Main {

    public static void main(String[] args) {
        singleton();
    }

    public static void singleton() { // Only allow 1 instance (Object)
        /////////////////////////////////////////////////////////////////////////////////////////
        // Creating 1, 2 and 3 are all still the same.
        /////////////////////////////////////////////////////////////////////////////////////////
        RingOfPower morphonite = RingOfPower.getInstance(7);
        System.out.println(morphonite); // Getting hashcode to ensure they are the same
        System.out.println(morphonite.getAbilities());
        RingOfPower morphonite2 = RingOfPower.getInstance(5);
        RingOfPower morphonite3 = RingOfPower.getInstance(6);

        morphonite = RingOfPower.getInstance(3); // Didn't create a new instance. Just pulled the first one.
        System.out.println(morphonite); // Getting hashcode to ensure they are the same
        System.out.println(morphonite.getAbilities());

        System.out.println(morphonite2); // Getting hashcode to ensure they are the same
        System.out.println(morphonite2.getAbilities());

        System.out.println(morphonite3); // Getting hashcode to ensure they are the same
        System.out.println(morphonite3.getAbilities());
    }

}
