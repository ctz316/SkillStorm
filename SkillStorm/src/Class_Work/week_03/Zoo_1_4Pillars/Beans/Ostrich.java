package Class_Work.week_03.Zoo_1_4Pillars.Beans;

public final class Ostrich extends Bird {

    public Ostrich() { }

    public Ostrich(String name, String color, boolean carnivore, boolean fly, double topSpeed) {
        super(name, color, carnivore, fly, topSpeed); // Super() - calls parent class constructors
    }

    public void hide(int duration) {
        System.out.println(getName() + " hides for " + duration + " hours.");
        System.out.println("If I can't see them, then they can't see me!");
    }

    @Override
    public void migrate() {
        speak();
        flap(25);
        System.out.println(getName() + " ran like the wind! At " + getTopSpeed() + " mph.");
    }


}
