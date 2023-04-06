package Class_Work.Week_06_LinkedLists.Generics;

public  class Vehicle {

    private String color;
    private String make;
    private String model;

    // valid constructor
        public Vehicle(String color, String make, String model) {
            //super(); // the first line is always a parent constructor call
            this.color = color;
            this.make = make;
            this.model = model;
        }
    // Overrides
        @Override
        public String toString() {
            return "[Vehicle: " + color + ", " + make + ", " + model + " ]";
        }

        public void drive() {
            System.out.println("Put Put");
        }

        public void park() {
            System.out.println("bump");
        }

        public void honk() {
            System.out.println("Hoonk");
        }

    // Getters and Setters
        public String getColor() {
            return this.color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getMake() {
            return this.make;
        }
        public void setMake(String make) {
            this.make = make;
        }
        public String getModel() {
            return this.model;
        }
        public void setModel(String model) {
            this.model = model;
        }

}