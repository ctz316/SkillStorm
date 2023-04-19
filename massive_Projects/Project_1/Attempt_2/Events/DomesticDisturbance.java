package SkillStorm.massive_Projects.Project_1.Attempt_2.Events;

import SkillStorm.massive_Projects.Project_1.Attempt_2.Characters;

import java.util.Scanner;

public class DomesticDisturbance {

    public void domesticDisturbance(Scanner in, Characters user) {
        System.out.println("\n" + "   ***   Domestic Disturbance Call   ***");
        System.out.println("Dispatch calls you to respond to a disturbance call. The call came in from a neighbor \n" +
                "who reports that she is hearing a lot of arguing between a man and a woman and is also hearing \n" +
                "loud crashes or bangs. The house belongs to a married couple and the system is showing a registered \n" +
                "firearm owned by the husband. There have been no previously recorded police interactions at this residence.");
        int temp;
        do {
            System.out.println("\n" + "Do you get to the house with lights and/or siren?");
            System.out.println("Press '1' for Lights");
            System.out.println("Press '2' for Siren");
            System.out.println("Press '3' for Both");
            System.out.println("Press '4' for Neither");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            user.addPoints(1);
            System.out.println("Correct. You should get there as fast as you can but do not want to announce yourself " + "\n" +
                    "with the siren when you get there.");
        } else if (temp == 2) {
            user.addPoints(0);
            System.out.println("You do not want to announce your arrival.");
        } else if (temp == 3) {
            user.addPoints(.5);
            System.out.println("You can use the siren until you get close to the neighborhood. Then you turn it off. " + "\n" +
                    "You would not want to announce yourself before getting to the door.");
        } else {
            user.addPoints(0);
            System.out.println("The lights would help you get there faster in case someone is or will get injured.");
        }

        System.out.println("\n" + "Do you call for backup while en-route?");
        do {
            System.out.println("Press '1' For yes.");
            System.out.println("Press '2' For no.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2));

        if (temp == 1) {
            user.addPoints(1);
            System.out.println("Correct. You already know there are at least 2 people involved. You will need backup.");
        } else {
            System.out.println("*** You are killed *** '\n'You already knew there are at least 2 angry people with \n " +
                    "a firearm in the house. These are some of the most dangerous situations an officer can do.");
            System.exit(0);
        }

        System.out.println("\n" + "You and your backup have arrived at the house. As all of you are walking up  \n " +
                "to the house, you hear raised voices from both a male and female. You find that the front door is\n " +
                "cracked open. You announce yourselves as you enter the house. Upon entering, you find the husband\n " +
                "has his arms straight out and is grabbing the wrists of the female.");
        do {
            System.out.println("\n" + "Who is the aggressor?");
            System.out.println("Press '1' For him.");
            System.out.println("Press '2' For her.");
            System.out.println("Press '3' For both.");
            System.out.println("Press '4' For neither.");
            System.out.println("Press '5' For you dont know.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4) && (temp != 5));

        if (temp == 1) {
            user.addPoints(0);
            System.out.println("At this point you do not know. I will say that I have been in this situation \n " +
                    "responding to this type of call and it was woman who was beating the man.");
        } else if (temp == 2) {
            user.addPoints(0);
            System.out.println("At this point you do not know. I will say that I have been in this situation \n " +
                    "responding to this type of call and it was woman who was beating the man.");
        } else if (temp == 3) {
            user.addPoints(0);
            System.out.println("At this point you do not know. I will say that I have been in this situation \n " +
                    "responding to this type of call and it was woman who was beating the man.");
        } else if (temp == 4) {
            user.addPoints(0);
            System.out.println("At this point you do not know. I will say that I have been in this situation \n " +
                    "responding to this type of call and it was woman who was beating the man.");
        } else {
            user.addPoints(1);
            System.out.println("Correct. You do not know.");
        }

        System.out.println("\n" + "You and your backup grabbed both the man and the woman and you physically \n " +
                "separate them. Both of them are still highly emotional and their adrenaline is pumping");
        do {
            System.out.println("\n" + "Where do you have them stand?");
            System.out.println("Press '1' for in the same room so that if one is lying, the other will tell you.");
            System.out.println("Press '2' to take both outside and seperated.");
            System.out.println("Press '3' to have your backup take one outside.");
            System.out.println("Press '4' to take one into another room.");

            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            user.addPoints(0);
            System.out.println("This will only make the scene un-manageable which more than likely result in you arresting both");
        } else if (temp == 2) {
            user.addPoints(1);
            System.out.println("Correct. With both amped up, they are dangerous and you do not know where they may have weapons hiding");
        } else if (temp == 3) {
            user.addPoints(0.5);
            System.out.println("It was a good idea to take at least one outside. But better for both as you do not know where the weapons are hidden");
        } else {
            System.out.println("*** You are fired from the police force *** '\n'You and your backup are the only '\n' " +
                    "things keeping you safe. You need to be able to see each other throughout the encounter. This '\n' " +
                    "would be a major violation of officer safety..");
            System.exit(0);
        }

        System.out.println("\n" + "They are now seperated. They are starting to be more cooperative.");
        do {
            System.out.println("\n" + "Are you allowed to search both of them for weapons?");
            System.out.println("Press '1' for yes.");
            System.out.println("Press '2' for no.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2));

        if (temp == 1) {
            user.addPoints(1);
            System.out.println("Correct. Now would be a good time.");
        } else {
            user.addPoints(0);
            System.out.println("You should fined out now rather than later.");
        }
    }
}
