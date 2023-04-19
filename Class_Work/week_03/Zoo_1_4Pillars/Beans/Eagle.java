package SkillStorm.Class_Work.week_03.Zoo_1_4Pillars.Beans;

public class Eagle extends Bird {

    public Eagle() { }

    public Eagle(String name, String color, boolean carnivore, boolean fly, double topSpeed) {
        super(name, color, carnivore, fly, topSpeed);
    }

    // Overriding
    // Same method signature, but different method from one we inherit
    @Override
    public void speak() {
        System.out.println("Merica!!!");
    }

}
