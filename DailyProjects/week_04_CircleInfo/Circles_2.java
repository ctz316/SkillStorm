package SkillStorm.DailyProjects.week_04_CircleInfo;

import java.util.Scanner;

//import static ProjectsForClass.week_04.Try_2.CircleInfo.*;

public class Circles_2 {

    // Creating variables
    static double random = (Math.random() * 100);
    static double radius;
    static double diameter = diameter();
    double circumference = circumference();
    double area = area();

    public static void main(String[] args) {
        // Open scanner to be passed around
        Scanner in = new Scanner(System.in);
        Circles_2();
    }

    // Constructors
    public void Circle_2(double radius) {
        Super(radius);
        this.area = area();
        this.circumference = circumference();
        this.diameter = diameter();
    }

    public static void Circles_2() {

        // Open scanner to be passed around
        Scanner in = new Scanner(System.in);

        // Greeting and getting info
        System.out.println("   ***   Let's Play with circles!!   ***");
        String sc;
        do {
            System.out.println("Do you wish to enter your own radius? 'Y' for yes or 'N' for no");
            sc = in.nextLine();
        } while (!sc.equalsIgnoreCase("Y") && !sc.equalsIgnoreCase("N"));

        if (sc.equalsIgnoreCase("N")) {
            System.out.println("The random default is: " + random);
            radius = random;
            System.out.println("Your radius was " + random + ", Your diameter is " + diameter() + ", your " +
                    "circumference is " + circumference() + ", and finally your area is " + area() + ".");
        } else {
            System.out.println("How many radius's would you like to enter? ");
            int radiusCount1 = in.nextInt();
            Double[] Circle = new Double[radiusCount1];

            System.out.println("Enter radius: ");
            for (int i = 0; i < radiusCount1; i++) {
                Circle[i] = in.nextDouble();
//                while (i < Circle.length) {
                    System.out.println("Your radius was " + Circle[i] + ", Your diameter is " + diameter() + ", your " +
                            "circumference is " + circumference() + ", and finally your area is " + area() + ".");
            }
        }
    }


    private void Super(double radius) {
    }

    public static double area() {
       return (Math.pow(radius, 2) * 3.14159);
    }

    public static double circumference() {
        return 3.14159 * diameter();
    }

    public static double diameter() {
        return radius * 2;
    }




}

