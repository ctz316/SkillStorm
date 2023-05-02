package SkillStorm.Class_Work.week_10_ThreadsCont.Singleton;

public class RingOfPower {

    /////////////////////////////////////////////////////////////////////////////////////////
    // singletons are made using a private constructor
    // can not use default constructor
    /////////////////////////////////////////////////////////////////////////////////////////

    // variables
    private static RingOfPower instance = null;
    private int abilities;

    // constructor
    private RingOfPower(int abilities) {
        this.abilities = abilities;
    }
    public static RingOfPower getInstance(int abilities) {
        if (instance == null) {
            instance = new RingOfPower(abilities);
        }
        return instance;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    // to make an instance, users need to go through a public method instead of a constructor
    /////////////////////////////////////////////////////////////////////////////////////////

    // getter
    public int getAbilities() {
        return this.abilities;
    }

    // methods
    public void invisibility() {
        System.out.println("Must have been the wind......");
    }

    public void superSpeed() {
        System.out.println("Kachooow!!!!");
    }

    public void dominationOfWill() {
        System.out.println("This is not the code you are looking for.");
    }

}
