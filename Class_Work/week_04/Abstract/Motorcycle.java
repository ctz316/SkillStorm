package SkillStorm.Class_Work.week_04.Abstract;

public abstract class Motorcycle extends Vehicle{

//    public Motorcycle() {}

    // Variables
        private String brand;
        private String model;

    // Constructors
        public Motorcycle(String brand, String model, String color, int topSpeed, String size, boolean trike) {
            this.brand = brand;
            this.model = model;
            setColor(color);
            setTopSpeed(topSpeed);
            setSize(size);
            if (trike) {
                setWheels(3);
            } else {
                setWheels(2);
            }
        }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    // Overrides
        @Override
        public void drive() {}
        @Override
        public void park() {}

        @Override // Tells java how to compare objects
        public boolean equals(Object obj) {
            if (this == obj) { // if memory addresses are the same
                return true;
            } else if (obj == null) { // if doesn't exist they are not equal
                return false;
            } else if (this.getClass() != obj.getClass()) {
                return false;
            }
            Motorcycle other = (Motorcycle) obj;
            if (this.brand.equals(other.getBrand()) && this.model.equals(other.getModel())) {
                return true;
            } else {
                return false;
            }
        }
}
