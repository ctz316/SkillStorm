package Class_Work.week_04.Abstract;

public abstract class Vehicle {

    // variables
        private String color;
        private int topSpeed;
        private int wheels;
        private String size;

    // every car is going to drive differently
        public abstract void drive();

        public abstract void park();

        public void honk() {
            System.out.println("Honk!");
        }

    // Setters and Getters
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public int getTopSpeed() {
            return topSpeed;
        }
        public void setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
        }
        public int getWheels() {
            return wheels;
        }
        public void setWheels(int wheels) {
            this.wheels = wheels;
        }
        public String getSize() {
            return size;
        }
        public void setSize(String size) {
            this.size = size;
        }

}
