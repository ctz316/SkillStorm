package massive_Projects.Project_1.Attempt_2;

import java.util.Arrays;

public class Charactors {

    // Setting up variables
    private String name;
    private double[] points;
    private String level;
    private double tPoints;

    // Constructors
    public Charactors(String name, double[] points, String level) {
        this.name = name;
        this.points = points;
        this.level = level;
    }


    // Methods
//    double tPoints =

    // Overrides
    @Override
    public String toString() {
        return String.format("[Player: name = %s, level = %s, points = %s]",
                this.name, this.level, Arrays.toString(this.points));
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double[] getPoints() {
        return points;
    }
    public void setPoints(double[] points) {
        this.points = points;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
}
