package DailyClassProjects.week_03.Shape_Project.Main;

public class Shapes_Run_Here {

    public static void main(String[] args) {

        Shapes_Variables_Hiding Picard = new Trapezoid("Picard", 4, 2, 6);
            Picard.all_Lines();
        Trapezoid Deanna = new Trapezoid("Deanna", 8, 6, 3);
            Deanna.all_Lines();
        Trapezoid Worf = new Trapezoid("Worf", 6, 4, 1);
            Worf.all_Lines();

        Shapes_Variables_Hiding Riker = new Rhombus("Riker", 6, 3);
            Riker.all_Lines();
        Rhombus LaForge = new Rhombus("LaForge", 7, 10);
        LaForge.all_Lines();
        Rhombus Data = new Rhombus("Data", 8, 9);
        Data.all_Lines();

        Shapes_Variables_Hiding Troi = new Parallelogram("Troi", 7, 3);
        Troi.all_Lines();
        Parallelogram DrCrusher = new Parallelogram("DrCrusher", 6, 2);
        DrCrusher.all_Lines();
        Parallelogram OBrian = new Parallelogram("OBrian", 5, 1);
        OBrian.all_Lines();
    }
}
