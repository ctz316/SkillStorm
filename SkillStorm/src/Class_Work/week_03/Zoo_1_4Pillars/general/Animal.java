package Class_Work.week_03.Zoo_1_4Pillars.general;

public class Animal {

    // This class will never run so does not need a MAIN
        // public accessible by everyone everywhere

        public String name;
        public String color;
        protected double age; // years
        private boolean fur;

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   Constructors   *******************************************////
    ///////////////////////////////////////////////////////////////////////////////////
        // Best practice is to set after setting variables
        public Animal(String name, String color, double age, boolean fur) {
            this.name = name;
            this.color = color;
            this.age = age;
            this.fur = fur;
        }

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************  Overloading Constructors   ********************************////
    ///////////////////////////////////////////////////////////////////////////////////
        public Animal(String name, double age, boolean fur) {
            this.name = name;
            this.age = age;
            this.fur = fur;
        }
        public Animal() {}



    ///////////////////////////////////////////////////////////////////////////////////
    ////**************  Getters and Setters   *************************************////
    ///////////////////////////////////////////////////////////////////////////////////
        public void setFur(boolean fur) { // Can set value
            this.fur = fur;
        }
        public boolean isFur() { // can see the value
            return this.fur;
        }
        public void setAge(double age) {
            this.age = age;
        }
        public double getAge() {
            return this.age;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getColor() {
            return this.color;
        }
}
