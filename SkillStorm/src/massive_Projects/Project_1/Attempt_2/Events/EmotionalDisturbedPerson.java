package massive_Projects.Project_1.Attempt_2.Events;

import massive_Projects.Project_1.Attempt_2.Characters;

import java.util.Scanner;

public class EmotionalDisturbedPerson {


    public static void aggravatedPerson(Scanner in, Characters user) {
        System.out.println("\n" + "   ***   Aggravated Person in a Convince Store   ***");
        System.out.println("Dispatch calls you to respond on a call about an aggravated person in a store. The /n " +
                "person came into the store arguing with someone very loudly and has a broken bottle in his hand. The other customers /n" +
                "are getting scared and leaving the store.");
        int temp;
        do {
            System.out.println("\n" + "Do you get to the store with lights and/or siren?");
            System.out.println("Press '1' for Lights:");
            System.out.println("Press '2' for Siren:");
            System.out.println("Press '3' for Both:");
            System.out.println("Press '4' for Neither:");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            user.addPoints(1);
            System.out.println("Correct.");
        } else if (temp == 2) {
            user.addPoints(0);
            System.out.println("You don't do just siren unless someone is blocking you.");
        } else if (temp == 3) {
            user.addPoints(1);
            System.out.println("You do want to get there quickly. Just remember to turn the siren off before you get close.");
        } else {
            user.addPoints(.5);
            System.out.println("You should get there as soon as possible.");
        }

        System.out.println("\n" + "As you enter the store you hear and see a man yelling loudly and hitting his head /n " +
                "against a pillar. You do see that he has a broken bottle in his hand. With no one near him");
        do {
            System.out.println("\n" + "Do you immediately rush to tackle him?");
            System.out.println("Press '1' for yes");
            System.out.println("Press '2' for no");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2));

        if (temp == 1) {
            user.addPoints(0);
            System.out.println("There is no one in immediate danger.");
        } else {
            user.addPoints(1);
            System.out.println("This is the way it should be.");
        }

        do {
            System.out.println("\n" + "Do you immediately start yelling at him to drop the broken bottle?");
            System.out.println("Press '1' for yes");
            System.out.println("Press '2' for no");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2));

        if (temp == 1) {
            user.addPoints(0.5);
            System.out.println("You could. But something is not right with this situation. By yelling you may aggravate the situation without cause.");
        } else {
            user.addPoints(1);
            System.out.println("Correct. There is no need to escalate the situation.");
        }

        System.out.println("\n" + "You start speaking to him. As you were talking to him, you see him jerk upright and " + "\n" +
                "start looking at you. You quickly realize that he was unaware of any other person around him. Once " + "\n" +
                "he realizes that you are a police officer, he starts walking towards you and crying that he broke " + "\n" +
                "his bottle of soda while looking for his lost his cat. You tell him to stop and put the bottle down. " + "\n" +
                " He stops and looks down at the bottle with a confused expression on his face.");
        do {
            System.out.println("\n" + "How long do you give him to drop the bottle before you taser him?");
            System.out.println("Press '1' until he moves toward another person.");
            System.out.println("Press '2' for 5 seconds.");
            System.out.println("Press '3' for 1 minute while you tell him to drop it.");
            System.out.println("Press '4' for You have protection so as long as he wants.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            user.addPoints(1);
            System.out.println("Correct. While he has the bottle, he is not threatening anyone with it");
        } else if (temp == 2) {
            user.addPoints(0);
            System.out.println("Welcome to the nightly news with your name dragged thru the mud.");
        } else if (temp == 3) {
            user.addPoints(0);
            System.out.println("Welcome to the nightly news with your name dragged thru the mud.");
        } else {
            user.addPoints(0);
            System.out.println("He is not threatening anyone, but, you do need to disarm him.");
        }
        System.out.println("\n" + "Dispatch calls you to respond on a call about an aggravated person in a store. The " + "\n" +
                "person came into the store arguing with someone very loudly and has a broken bottle in his hand. The other customers " + "\n" +
                "are getting scared and leaving the store.");
        do {
            System.out.println("\n" + "While you are talking to him, Where should your partner stand?");
            System.out.println("Press '1' for next to you");
            System.out.println("Press '2' farther in the store and off to the side.");
            System.out.println("Press '3' to be behind the guy.");
            System.out.println("Press '4' to stand behind you.");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3) && (temp != 4));

        if (temp == 1) {
            user.addPoints(0);
            System.out.println("This offers you no tactical advantage if needed.");
        } else if (temp == 2) {
            user.addPoints(1);
            System.out.println("Correct. This would allow them to be in your sight, but mostly out of his and should /n" +
                    "there be a need, your partner can grab the without getting in your way.");
        } else if (temp == 3) {
            user.addPoints(0);
            System.out.println("The guy is not thinking clearly and would more than likely take this as a threat. Escalating the situation.");
        } else {
            user.addPoints(0);
            System.out.println("This offers you no tactical advantage if needed.");
        }
    }
}
