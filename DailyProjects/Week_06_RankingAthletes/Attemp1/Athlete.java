package SkillStorm.DailyProjects.Week_06_RankingAthletes.Attemp1;

import java.util.ArrayList;
import java.util.Scanner;

public class Athlete implements Comparable<Athlete> {

    // Setting variables
    private String name;
    private final double careerWins;
    private final double careerLoses;
    private double winPercent;
    private double totalGamesPlayed;

    // Scanner
    static Scanner in = new Scanner(System.in);

    // Constructors
    public Athlete(String name, double careerWins, double careerLoses) {
        this.name = name;
        this.careerWins = careerWins;
        this.careerLoses = careerLoses;
        totalGamesPlayed = totalGames(careerWins, careerLoses);
        winPercent = winPercent(careerWins, totalGamesPlayed);
    }

    // *** MAIN ***
    public static void main(String[] args) {

        ArrayList<Athlete> athleteArrayList = new ArrayList<>();

        athleteArrayList.add(new Athlete("John", 9, 9));
        athleteArrayList.add(new Athlete("Joe", 5, 10));
        athleteArrayList.add(new Athlete("Mike", 9, 4));
        athleteArrayList.add(new Athlete("Jason", 8, 12));
        athleteArrayList.add(new Athlete("Kevin", 11, 14));
        Athlete yuppers1 = question1(athleteArrayList);
        Athlete yuppers2 = question2(athleteArrayList);
        returnStatement(yuppers1, yuppers2);
        in.close();
    }

    public static Athlete question1(ArrayList<Athlete> xyz) {
        int temp;
        do {
            System.out.println("Please select the first player from the list you would like to compare: ");
            temp = q1Statements(xyz);
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4) && (temp != 5));
        return answersForQuestions(xyz, temp);
    }

    private static int q1Statements(ArrayList<Athlete> xyz) {
        int temp;
        System.out.println("Press '1' for " + xyz.get(0));
        System.out.println("Press '2' for " + xyz.get(1));
        System.out.println("Press '3' for " + xyz.get(2));
        System.out.println("Press '4' for " + xyz.get(3));
        System.out.println("Press '5' for " + xyz.get(4));
        temp = in.nextInt();
        return temp;
    }



    public static Athlete question2(ArrayList<Athlete> xyz) {
        int temp;
        do {
            System.out.println("Please select the second player from the list you would like to compare: ");
            temp = q1Statements(xyz);
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4) && (temp != 5));
        return answersForQuestions(xyz, temp);
    }

    private static Athlete answersForQuestions(ArrayList<Athlete> xyz, int temp) {
        Athlete comp2;
        if (temp == 1) {
            comp2 = xyz.get(0);
        } else if (temp == 2) {
            comp2 = xyz.get(1);
        } else if (temp == 3) {
            comp2 = xyz.get(2);
        } else if (temp == 4) {
            comp2 = xyz.get(3);
        } else comp2 = xyz.get(4);
        return comp2;
    }

    public static void returnStatement(Athlete comp1 , Athlete comp2) {
        switch (comp1.compareTo(comp2)) {
            case -1:
                System.out.println("The better player is: " + comp1);
                break;
            case  1:
                System.out.println("The better player is: " + comp2);
                break;
            default:
                System.out.println("They have the same win percentage.");
                break;
        }
    }

    // Methods
    public double winPercent(double careerWins, double totalGamesPlayed) {
         return winPercent = (careerWins / totalGamesPlayed) * 100;
    }
    public double totalGames(double careerWins, double careerLoses) {
        return totalGamesPlayed = careerWins + careerLoses;
    }

    //Overrides
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", careerWins=" + careerWins +
                ", careerLoses=" + careerLoses +
                ", winPercent=" + winPercent +
                ", totalGamesPlayed=" + totalGamesPlayed;
    }
    @Override
    public int compareTo(Athlete p1) {
    if (p1 == null) {
        throw new NullPointerException();
        }
        Double thisWinPercent = this.winPercent;
        Double otherWinPercent = p1.winPercent;
        return otherWinPercent.compareTo(thisWinPercent);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

