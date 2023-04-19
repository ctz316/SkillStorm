package SkillStorm.Class_Work.week_03.Zoo_2_Abstraction_Casting;

public class Goblin implements Shark {

    // Setting local variables
        private String name;
        private double noseLength;
        private int howScary;
        private double speed;

    // creating the constructors
        public Goblin(String name, double noseLength, int howScary, double speed) {
            this.name = name;
            this.noseLength = noseLength;
            this.howScary = howScary;
            this.speed = speed;
        }

    // Overrides
        @Override
        public void swim(double distance) {
            System.out.println(name + " swims " + (distance * noseLength) + " miles at " + speed + " mph.");
        }
        @Override
        public void bite() {
            System.out.println(name + " bites with a force of " + (howScary * noseLength) + " N.");
            if (howScary < 5) {
                System.out.println("It was adorable.");
            } else {
                System.out.println("EEEEkkkkkk!!!");
            }
        }
        @Override
        public void hunt() {
            swim(howScary * noseLength);
            bite();
            System.out.println(name + " swims off into the deep at " + speed + " satisfied");
        }

    // Getters and Setters
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getNoseLength() {
            return noseLength;
        }
        public void setNoseLength(double noseLength) {
            this.noseLength = noseLength;
        }
        public int getHowScary() {
            return howScary;
        }
        public void setHowScary(int howScary) {
        this.howScary = howScary;
    }
        public double getSpeed() {
            return speed;
        }
        public void setSpeed(double speed) {
            this.speed = speed;
        }
}
