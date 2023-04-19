package SkillStorm.Class_Work.Week_05_ArrayLists.Beans;

public class Vehicle {

    // variables
    private String color;
    private String make;
    private String model;


    // constructor
    public Vehicle(String model, String make, String color) {
        //super(); // the first line is always super() on constructor
        this.model = model;
        this.make = make;
        this.color = color;
    }

@Override
public String toString() {
        return "[Vehicle: " + color + ", " + make + ", " + model + "]";
}


    // Getters and Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
