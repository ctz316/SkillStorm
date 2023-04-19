package SkillStorm.Class_Work.week_04.Abstract;

    public class Sport extends Motorcycle {

        // variables
            private boolean wheelie;

        // Constructor
            public Sport(String brand, String model, String color, int topSpeed, String size, boolean wheelie) {
                super(brand, model, color, topSpeed, size, false);
                this.wheelie = wheelie;
            }

        // Overrides
            @Override
            public void drive() {
                System.out.println("Zoom Zoom!");
            }
            public void drive(int num) { // Overload - different form of same method, part of polymorphism.
                for (int i = 0; i < num; i++) {
                    System.out.print("Vroom!!!");
                }
                System.out.println();
            }
            @Override
            public void park() {
                System.out.println("mooZ mooZ!");
            }
            @Override
                public String toString() {
                    if (this.wheelie) {
                        return String.format("%s %s %s that can wheelie", getColor(), getBrand(), getModel());
                    } else {
                        return String.format("%s %s %s can't wheelie", getColor(), getBrand(), getModel());
                    }
                }

        // methods
            public void doWheelie() {
                if (wheelie) {
                    System.out.println("Sick Wheelie");
                } else {
                    System.out.println("Bike's totaled");
                }
            }

        // Getters and setters
            public boolean isWheelie() {
                return wheelie;
            }
            public void setWheelie(boolean wheelie) {
                this.wheelie = wheelie;
            }
    }