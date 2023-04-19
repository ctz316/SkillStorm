package SkillStorm.Class_Work.week_03.Zoo_2_Abstraction_Casting;

public class HammerHead implements Shark{

    // Encapsulating specific variables for hammerhead
        private String name;
        private double length;
        private double biteForce;
        private double headSize;
        private double speed;

    // creating the constructors
        public HammerHead( String name, double length,double biteForce, double headSize, double Speed) {
            this.name = name;
            this.length = length;
            this.biteForce = biteForce;
            this.headSize = headSize;
            speed = Speed;
        }

    // creating hammerhead methods to override the methods on Shark Class
        @Override
        public void swim(double distance) {
            System.out.println(name +" is swimming " + ((distance/headSize) * biteForce) + " miles at " + speed + " mph.");
        }
        @Override
        public void bite() {
            System.out.println( name + " bit with the strength of " + biteForce + " lbs.");
        }
        @Override
        public void hunt() {
            swim((length/headSize) * speed);
            bite();
            System.out.println(name + " swims off into the sunset, satisfied.");
        }

    // getters and setters
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
        public double getBiteForce() {
            return biteForce;
        }
        public void setBiteForce(double biteForce) {
            this.biteForce = biteForce;
        }
        public double getHeadSize() {
            return headSize;
        }
        public void setHeadSize(double headSize) {
            this.headSize = headSize;
        }
        public double getSpeed() {
            return speed;
        }
        public void setSpeed(double speed) {
        this.speed = speed;
    }
}
