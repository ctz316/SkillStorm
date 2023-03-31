package massive_Projects.Project_1.Attempt_2;

public class Characters {

    // Setting up variables
    private static String name;
    private static double points;
    private static String level;

    // Constructors
    public Characters(String name, String level) {
        this.name = name;
        this.level = level;
    }


    // Methods
    public double finalScore(Characters user) {
        double finalScore;
        if (user.getLevel().equals("recruit")) {
            return  (points * 1.5);
        } else if (user.getLevel().equals("patrol")) {
            return (points * 1.25);
        } else {
            return (points);
        }
    }

    public Object winLose(Characters user) {
        if (user.finalScore(user) >= 80) {
            System.out.println("Congratulations, You passed this game at the level of " + user.getLevel() + ".");
        }
        else {
            System.out.println("You have failed this game at the level of " + user.getLevel() + ".");
        }
        return "";
    }

    public void gameOver(Characters user) {
        System.out.println("*******************************************************************************");
//        System.out.println("");
        System.out.println('\n' + user.getName() + ", You got " + user.finalScore(user) + " points out of a possible 100.");
        System.out.println(winLose(user));
        System.out.println("*******************************************************************************");
    }


    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static double getPoints() {
        return points;
    }
    public static void setPoints(double points) {
        Characters.points = points;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public double addPoints(double x) {
        points += x;
        return x;
    }


}
