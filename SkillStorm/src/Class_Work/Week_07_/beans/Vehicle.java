package Class_Work.Week_07_.beans;

public  class Vehicle {

    public enum Color { // Allows me to specify values for user to choose from. // enums are final and static, need to be capitol
        BLUE,
        RED,
        GREEN,
        BLACK,
        WHITE,
        ORANGE,
        TAN,
        SILVER
    }

    private String color;
    private String make;



    private String model;
    private Color colorV2;

    public Vehicle(Color color, String make, String model) {
        this.colorV2 = color;
        this.make = make;
        this.model = model;
        this.colorV2 = Color.GREEN;
    }

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
            return "[Vehicle: " + color + ", " + make + ", " + model + ", " + colorV2 + "]";
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
        public Color getColorV2() {
            return colorV2;
        }
        public void setColorV2(Color colorV2) {
            this.colorV2 = colorV2;
        }
}