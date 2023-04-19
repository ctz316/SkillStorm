package SkillStorm.DailyProjects.week_03_Shape_Project.Main;

public class Shapes_Variables_Hiding {

    // Private Variables
        private String name;
        private final int numOfSides = 4;
        private int top_Side;
        private int middle_Length_In_Height;
        private int middle_Length_In_Width;
        private int bottom_Side;
        private static int shapeCount = 1;

     // Setting constructor so it can be used
        public Shapes_Variables_Hiding(String name,int top_Side, int middle_Length_In_Height, int bottom_Side) {
            setName(name);
            settop_Side(top_Side);
            setmiddle_Length_In_Height(middle_Length_In_Height);
            setmiddle_Length_In_Width(middle_Length_In_Width);
            setbottom_Side(bottom_Side);
        }

        public Shapes_Variables_Hiding(String name, int middle_Length_In_Width, int middle_Length_In_Height) {
            setName(name);
            setmiddle_Length_In_Width(middle_Length_In_Width);
            setmiddle_Length_In_Height(middle_Length_In_Height);
        }

    // setting up methods
        public static int sName() {
            shapeCount++;
            return shapeCount;
        }
        public void line_1() {
            System.out.println("   ***   " + name + ", Here is the shape information for a " + sName() + " ***   ");
        }
        public void line_2() {
            System.out.println("It has " + numOfSides + " sides.");
        }
        public void line_3() {
            System.out.println("It has " + numOfSides + " sides.");
        }
        public void line_4() {
                System.out.println("The count of shapes is: " + shapeCount);
        }
        public void all_Lines() { // Grouping these into 1 command
            line_1();
            line_2();
            line_3();
            line_4();
            shapeCount++;
            System.out.println("");
        }

    // Setters and Getters
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int gettop_Side() {
            return this.top_Side;
        }
        public void settop_Side(int top_Side) {
            this.top_Side = top_Side;
        }
        public int getbottom_Side() {
            return this.bottom_Side;
        }
        public void setbottom_Side(int bottom_Side) {
            this.bottom_Side = bottom_Side;
        }
        public void setmiddle_Length_In_Width(int middle_Length_In_Width) {
            this.middle_Length_In_Width = middle_Length_In_Width;
        }
        public int getmiddle_Length_In_Width() {
            return this.middle_Length_In_Width;
        }
        public int getmiddle_Length_In_Height() {
            return this.middle_Length_In_Height;
        }
        public void setmiddle_Length_In_Height(int middle_Length_In_Height) {
            this.middle_Length_In_Height = middle_Length_In_Height;
        }

}

