package SkillStorm.Class_Work.week_04.Abstract;

public class GrandTouring extends Motorcycle {

    // Constructors
        public GrandTouring(String brand, String model, String color, int topSpeed, String size, boolean trike) {
            super(brand, model, color, topSpeed, size, trike);
        }

    // Overrides
        @Override
        public void drive() {
            System.out.println("Vroom!");
        }
        @Override
        public void park() {
            System.out.println("moorV!");
        }

    // Methods
        public void saddleBags(String object) {
            System.out.println("Storing a " + object + " in my saddle bag.");
        }
        @Override
        public String toString() {
            return String.format("%s, %s, %s, with %d wheels",  getBrand(), getModel(), getColor(), getWheels());
        }
}