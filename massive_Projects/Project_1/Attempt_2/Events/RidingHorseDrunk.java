package SkillStorm.massive_Projects.Project_1.Attempt_2.Events;

import SkillStorm.massive_Projects.Project_1.Attempt_2.Characters;

import java.util.Scanner;

public class RidingHorseDrunk {

    public void horse(Scanner in, Characters user) {
        int temp;
        System.out.println("\n" + "   ***   Impaired Person Riding a Horse   ***");
        System.out.println("You respond to a call of a semi-conscious person riding a horse on the side of " +
                "the road.");
        do {
            System.out.println("\n" + "Do you call for back up?");
            System.out.println("Press '1' for yes");
            System.out.println("Press '2' for no");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2));

        if (temp == 1) {
            user.addPoints(1);
            System.out.println("Correct. You would not be able to handle the person and horse if needed.");
        } else {
            user.addPoints(0);
            System.out.println("You would not be able to handle the person and horse if needed.");
        }

        do {
            System.out.println("\n" + "Do you have your lights and/or siren on?");
            System.out.println("Press '1' for lights");
            System.out.println("Press '2' for siren");
            System.out.println("Press '3' for both");
            System.out.println("Press '4' for neither");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            user.addPoints(1);
            System.out.println("Correct. The rider or someone else could get hurt if you do not get there fast.");
        } else if (temp == 2) {
            System.out.println("*** You are fired *** /n You spooked the horse into traffic killing the rider and the horse.");
            System.exit(0);
        } else if (temp == 3) {
            System.out.println("*** You are fired *** /n You spooked the horse into traffic killing the rider and the horse.");
            System.exit(0);
        } else {
            user.addPoints(.5);
            System.out.println("You should get there as quickly as possible to prevent injuries.");
        }

        System.out.println("\n" + "You have gotten out of the car and have successfully stopped the horse from walking. " + "\n" +
                "While talking to the rider you detect the presence of an alcoholic beverage smell coming from " + "\n" +
                "the rider. While speaking to him you can see that he has a glazed expression in his answers to " + "\n" +
                "your questions are not coherent");
        do {
            System.out.println("\n" + "Has he broken any laws?");
            System.out.println("Press '1' for no");
            System.out.println("Press '2' for reckless endangerment of pedestrians");
            System.out.println("Press '3' for DUI (Driving Under the Influence)");
            System.out.println("Press '4' for public intoxication");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            user.addPoints(0);
            System.out.println("He has. If you are moving from anything other than your own power, You are considered driving.");
        } else if (temp == 2) {
            user.addPoints(0);
            System.out.println("If you are moving from anything other than your own power, You are considered driving.");
        } else if (temp == 3) {
            user.addPoints(1);
            System.out.println("Correct. If you are moving from anything other than your own power, You are considered driving.");
        } else {
            user.addPoints(0);
            System.out.println("There are no laws in AZ for being drunk in public. And, If you are moving from /n" +
                    "anything other than your own power, You are considered driving.");
        }

        do {
            System.out.println("\n" + "What do you do with the horse?");
            System.out.println("Press '1' to call animal control.");
            System.out.println("Press '2' to call his family member to come get it.");
            System.out.println("Press '3' to confiscate the horse.");
            System.out.println("Press '4' let it loose.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            user.addPoints(1);
            System.out.println("Correct. The owner would also be charged with animal abuse and lose this horse plus /n" +
                    "any other horses he might have");
        } else if (temp == 2) {
            user.addPoints(0);
            System.out.println("The owner would also be charged with animal abuse and lose this horse plus /n" +
                    "any other horses he might have");
        } else if (temp == 3) {
            user.addPoints(0);
            System.out.println("The department does not have farm for confiscated horses.");
        } else {
            System.out.println("*** You are Fired *** /n You opened the department up for a lawsuit by the owner /n" +
                    "and anyone harmed by the animal after you let it go. Not to mention the animal rights groups.");
            System.exit(0);
        }

        do {
            System.out.println("\n" + "Do you take him to the jail now or hospital?");
            System.out.println("Press '1' for jail");
            System.out.println("Press '2' for hospital");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2));

        if (temp == 1) {
            user.addPoints(1);
            System.out.println("Correct. There was no reason given that he should go to the hospital.");
        } else {
            user.addPoints(0);
            System.out.println("Your boss is upset you wasted time when there was no indication there was a medical emergency.");
        }
    }
}