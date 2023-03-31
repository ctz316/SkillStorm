package massive_Projects.Project_1.Attempt_2.Events;

import massive_Projects.Project_1.Attempt_2.Characters;

import java.util.Scanner;

public class Speeder {

        public static void speed(Scanner in, Characters user) {
            int temp;
            System.out.println("\n" + "   ***   Speeding   ***");
            System.out.println("You are on patrol on the freeway during the day in an unmarked police car. When " + "\n" +
                    "suddenly, in the rear-view mirror you see a vehicle speeding and fly past you. You speed up " + "\n" +
                    "and determine that they are doing 25 mph over the speed limit. You initiate your siren and " + "\n" +
                    "lights. The speeding car slows down and pulls over to the shoulder of the road. You can see " + "\n" +
                    "there is a total of three occupants.");
            do {
                System.out.println("\n" + "Do you call for backup?");
                System.out.println("Press '1' for Yes, and tell them to get here quickly.");
                System.out.println("Press '2' for no");
                System.out.println("Press '3' for yes, but to only be in the area.");
                temp = in.nextInt();
            } while ((temp != 1) && (temp != 2) && (temp != 3));

            if (temp == 1) {
                user.addPoints(0);
                System.out.println("They pulled over without incident. There is no indication of danger.");
            } else if (temp == 2) {
                user.addPoints(.5);
                System.out.println("There is no indication of danger, but having backup close by would be a good idea.");
            } else {
                user.addPoints(1);
                System.out.println("Correct, There is no indication of danger, but having backup close by would be a good idea.");
            }

            do {
                System.out.println("\n" + "What side of their car do you walk up on?");
                System.out.println("Press '1' for drivers side.");
                System.out.println("Press '2' for passenger side.");
                System.out.println("Press '3' for the side with less people.");
                System.out.println("Press '4' for the side with more people.");
                temp = in.nextInt();
            } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

            if (temp == 1) {
                user.addPoints(.5);
                System.out.println("If this is the side with the most people yes.");
            } else if (temp == 2) {
                user.addPoints(.5);
                System.out.println("If this is the side with the most people yes.");
            } else if (temp == 3) {
                user.addPoints(0);
                System.out.println("You would not have a good view of the persons hands that is in back.");
            } else {
                user.addPoints(1);
                System.out.println("Correct. This gives you the best view of the occupants.");
            }

            do {
                System.out.println("\n" + "Do you touch the car?");
                System.out.println("Press '1' for yes");
                System.out.println("Press '2' for no");
                temp = in.nextInt();
            } while ((temp != 1) && (temp != 2));

            if (temp == 1) {
                user.addPoints(1);
                System.out.println("Correct. You are leaving finger prints as evidence if the car leaves the scene.");
            } else {
                user.addPoints(0);
                System.out.println("You always touch the car to leave evidence if they take off.");
            }

            do {
                System.out.println("\n" + "Where do you stand next to the car while talking to the driver?");
                System.out.println("Press '1' for next to the front seat.");
                System.out.println("Press '2' for next to the back seat.");
                System.out.println("Press '3' for in between the front and back seat.");
                System.out.println("Press '4' for in front of the driver facing all of them.");
                temp = in.nextInt();
            } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

            if (temp == 1) {
                user.addPoints(0);
                System.out.println("You would not have a good view of the back passenger if they pulled a gun and shot you.");
            } else if (temp == 2) {
                user.addPoints(0);
                System.out.println("This would make speaking to the driver problem-matic.");
            } else if (temp == 3) {
                user.addPoints(1);
                System.out.println("Correct. This would give you a good view of all passengers.");
            } else {
                user.addPoints(0);
                System.out.println("This would open you up to not just weapons in the car, but also the car would be a danger.");
            }

            do {
                System.out.println("\n" + "What percent of you attention is on the driver and passengers vs. your surroundings?");
                System.out.println("Press '1' for 100%");
                System.out.println("Press '2' for 75%");
                System.out.println("Press '3' for 50%");
                System.out.println("Press '4' for 25%");
                temp = in.nextInt();
            } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

            if (temp == 1) {
                System.out.println("Police lights attract un-attentive drivers. You could got hit by another car on the freeway.");
                System.exit(0);
            } else if (temp == 2) {
                user.addPoints(1);
                System.out.println("Correct. Police lights attract un-attentive drivers.");
            } else if (temp == 3) {
                user.addPoints(0);
                System.out.println("You are opening yourself up to hidden danger in the car.");
            } else {
                user.addPoints(0);
                System.out.println("You are opening yourself up to hidden danger in the car.");
            }
        }
}
