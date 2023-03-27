package ProjectsForClass.week_03.Shape_Project.Main;

    public final class Trapezoid extends Shapes_Variables_Hiding {

        // Constructors
            public Trapezoid(String name, int top_Side, int middle_Length_In_Height, int bottom_Side) {
                super (name, top_Side, middle_Length_In_Height, bottom_Side);
            }

        // Methods
            public double formula() {
                return (gettop_Side() + getbottom_Side()) * getmiddle_Length_In_Height();
            }

        // Overrides
            @Override
            public void line_3() {

        // Variables
            String sName = "Trapezoid";
            System.out.println("The area of a " + sName + " with those dimensions, is " + formula() + ".");
            }

        // Override again - Doesn't work when I move it.
            @Override
            public void line_1() {
                System.out.println("   ***   " + getName() + ", Here is the shape information for a Trapezoid ***   ");
            }
}