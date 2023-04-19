package SkillStorm.DailyProjects.week_03_Shape_Project.Main;

    public final class Parallelogram extends Shapes_Variables_Hiding {

        // Constructors
            public Parallelogram(String name, int middle_Length_In_Height, int middle_Length_In_Width){
                super(name, middle_Length_In_Height, middle_Length_In_Width);
            }

        // Variables
            private static final String sName = "Parallelogram";

        // Methods
            public double formula() {
                return (getmiddle_Length_In_Width() * getmiddle_Length_In_Height());
                    }
        // Overrides
            @Override
            public void line_3() {
                    System.out.println("The area of a " + sName + " with those dimensions, is " + formula() + ".");
                    }
            @Override
            public void line_1() {
                    System.out.println("   ***   " + getName() + ", Here is the shape information for a " + sName + " ***   ");
                    }
    }
