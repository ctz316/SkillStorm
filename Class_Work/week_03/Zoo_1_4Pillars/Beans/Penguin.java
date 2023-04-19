package SkillStorm.Class_Work.week_03.Zoo_1_4Pillars.Beans;

public class Penguin extends Bird { // inherits from classes with the extends word

    public Penguin() { }

    public Penguin(String name, String color, boolean carnivore, boolean fly, double topSpeed) {
        super(name, color, carnivore, fly, topSpeed);
    }

    public void dance() {
        System.out.println(getName() + " has happy feet.");
    }

    public void slide(double distance) {
        System.out.println(getName() + " slide " + distance + " miles, majesticaly!");
    }

    @Override
    public void speak() {
        System.out.println("HONK!");
    }

    @Override
    public void  migrate() {
        dance();
        speak();
        System.out.println(getName() + " is in the zone. It dances at " + getTopSpeed() + " mph.");
    }

}
