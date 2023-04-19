package SkillStorm.Class_Work.week_03.Zoo_1_4Pillars.Beans;

public class Bird {

    // best practice, properties private and use getters and setters
        private String name;
        private String color;
        private boolean carnivore;
        private boolean fly;
        private double topSpeed;


    // Setting up constructors
        public Bird() {}

        public Bird(String name, String color, boolean carnivore, boolean fly, double topSpeed) {
            this.name = name;
            this.color = color;
            this.carnivore = carnivore;
            this.fly = fly;
            this.topSpeed = topSpeed;
        }
    // Setting up methods
        public void feed(double lbs) {
            System.out.println(getName() + " Ate " + lbs + " lbs of food. ");
        }
        public void flap(int times) {
            System.out.println(getName() + " Flapped " + times + " times. It  was glorious. ");
        }
        public void speak() {
            System.out.println("Chirp");
        }
        public void migrate() { // Can do that because I am in same class - Non-Static, they can call other non-static
            flap(20);
            speak();
            System.out.println(getName() + "Flew like the wind! At " + topSpeed + " mph.");
        }

    // Setters and getters
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getColor() {
            return this.color = color;
        }
        public void setColor(String brown) {
            this.color = color;
        }

        public boolean isCarnivore(boolean carnivore) {
                return this.carnivore;
        }

        public void setCarnivore(boolean carnivore) {
            this.carnivore = carnivore;
        }

        public boolean isFly() {
            return this.fly;
        }
        public void setFly(boolean fly){
            this.fly = fly;
        }
        public double getTopSpeed() {
            return this.topSpeed;
        }
        public void setTopSpeed(double topSpeed){
            this.topSpeed = topSpeed;
        }
}
