package SkillStorm.massive_Projects.Project_1.Attempt_2.Events;

import SkillStorm.massive_Projects.Project_1.Attempt_2.Characters;

import java.util.Scanner;

public class DrunkInAz {

    public void welfareCheck(Scanner in, Characters user) {
        System.out.println("\n" + "   ***   Welfare Check   ***");
        System.out.println("Dispatch calls you to respond on a call about a person walking on the sidewalk of a major \n" +
                "road who is stumbling. Dispatch informs you that the person is described as a male in their mid-20s \n" +
                "wearing a black hoodie sweatshirt and blue jeans. No other information has been reported.");
        int temp;
        do {
            System.out.println("\n"+"Do you get to the person with lights and/or siren?");
            System.out.println("Press '1' for Lights");
            System.out.println("Press '2' for Siren");
            System.out.println("Press '3' for Both");
            System.out.println("Press '4' for Neither");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            user.addPoints(0.5);
            System.out.println("There has been no indication that this is an emergency.");
        } else if (temp == 2) {
            user.addPoints(0);
            System.out.println("There has been no indication that this is an emergency.");
        } else if (temp == 3) {
            user.addPoints(0);
            System.out.println("There has been no indication that this is an emergency.");
        } else {
            user.addPoints(1);
            System.out.println("Correct. There is no emergency that you know of right now.");
        }

        System.out.println("\n"+"\n"+"You have arrived at the location and observe a person matching the description. As you \n" +
                "walk up to this person, you can tell they have seen you and he is trying to go around you without \n" +
                "talking. You can see both his hand and that they are empty. You raise your arm to bar his way and \n" +
                "he stops and turns towards you with his hands in front of him in a nonthreatening manner. There \n" +
                "is a smell of an alcoholic beverage coming off him. You ask for his name, but, he just continues \n" +
                "to stare at you not saying a word.");
        do {
            System.out.println("\n"+"What do you do?");
            System.out.println("Press '1' To grab him and start placing him under arrest.");
            System.out.println("Press '2' To talk to him and let him know your just making sure he's ok.");
            System.out.println("Press '3' To tell him he can talk now or at the jail.");
            System.out.println("Press '4' To start yelling at him and telling him how much trouble he is in.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            System.out.println("*** You Lose *** '\n'You are now arrested and convicted for kidnapping.");
            System.exit(0);
        } else if (temp == 2) {
            user.addPoints(1);
            System.out.println("Correct. So far there is no threat. You need to get him talking.");
        } else if (temp == 3) {
            user.addPoints(.5);
            System.out.println("You are escalating the situation needlessly.");
        } else {
            user.addPoints(0);
            System.out.println("You are escalating the situation needlessly.");
        }

        System.out.println("\n"+"While you are talking to him, Do you call for backup?");
        do {
            System.out.println("Press '1' For yes.");
            System.out.println("Press '2' For no.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2));

        if (temp == 1) {
            user.addPoints(0);
            System.out.println("While you can, You would have a hard time explaining to your sergeant why you did.");
        } else {
            user.addPoints(1);
            System.out.println("Correct. So far he has shown no sign of being hostile.");
        }

        System.out.println("\n"+"He finally gives you is ID but is still not talking. You call it in the dispatch \n" +
                "and find that there are no outstanding warrants for this person. ");
        do {
            System.out.println("\n"+"Do you do a weapons search on him?");
            System.out.println("Press '1' For yes.");
            System.out.println("Press '2' For no.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2));

        if (temp == 1) {
            user.addPoints(.5);
            System.out.println("While technically you could, You had better have a really good reason for your sergeant.");
        } else {
            user.addPoints(1);
            System.out.println("Correct. There has been no threatening actions from him.");
        }

        System.out.println("\n"+"He is still just staring at you and refusing to talk. You quickly realise that further \n" +
                "questions is not going to produce any results.");
        do {
            System.out.println("\n"+"What do you do?");
            System.out.println("Press '1' To shoulder check him.");
            System.out.println("Press '2' To arrest him.");
            System.out.println("Press '3' To tell him to be safe tonight and let him go.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3));

        if (temp == 1) {
            user.addPoints(0);
            System.out.println("Could be a terminal offense if he has a witness and reports you.");
        } else if (temp == 2) {
            System.out.println("*** You Lose *** '\n'You are now arrested and convicted for kidnapping.");
            System.exit(0);
        } else {
            user.addPoints(1);
            System.out.println("Correct. In Arizona, there is no drunk in public laws and he has not broken any other law.");
        }


    }
}
