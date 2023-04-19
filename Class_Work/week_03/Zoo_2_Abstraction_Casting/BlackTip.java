package SkillStorm.Class_Work.week_03.Zoo_2_Abstraction_Casting;

public class BlackTip implements Shark, Fish {

    // Setting local variables
        private String name;
        private double length;
        private double speed;
        private int humanAttacks;

    // creating the constructors
        public BlackTip (String name, double length, double speed, int humanAttacks) {
            this.name = name;
            this.length = length;
            this.speed = speed;
            this.humanAttacks = humanAttacks;
        }

    // Overrides
        @Override
        public void swim(double distance) {
            System.out.println(name + " swims " + distance + " is looking for humans at " + speed + " mph.");
        }
        @Override
        public void bite() {
            System.out.println(name + " finds a human and bites with " + (length * humanAttacks) + " N of force.");
            this.humanAttacks++;
        }
        @Override
        public void hunt() {
            System.out.println("Fish are friends, not food!");
            swim(length * humanAttacks + speed);
            bite();
            System.out.println(name + " swims off to the beach, Satisfied");
        }
        @Override
        public void bubbles() {
            System.out.println("Glub Glub Glub");
        }
        @Override
        public void view() {
            System.out.println("My name is " + name + " I am a " + length + " ft long Blacktip Shark. I have bite " +
                    humanAttacks + " people..... that you know of.");
        }

    // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public int getHumanAttacks() {
            return humanAttacks;
        }

        public void setHumanAttacks(int humanAttacks) {
            this.humanAttacks = humanAttacks;
        }


}


