package SkillStorm.massive_Projects.Project_1.Attempt_2.Events;

import SkillStorm.massive_Projects.Project_1.Attempt_2.Characters;

import java.util.Scanner;

public class OpeningStatements {

    // Variables
    private static String userName;
    private static String recruit;
    private static String patrol;
    private static String sergeant;

      public Characters openingGreeting(Scanner in) {

          int temp;

        System.out.println("\n" + "***   Welcome to the police scenarios Game   ***" + "\n"+
                "The object of this game is to enforce the law while surviving. "+"\n"+
                "Here are some tips you will need to finish the game."+"\n"+
                "\n"+
                "  I. You will need to think about what is a crime and what is not."+"\n"+
                " II. This game is based on Arizona laws."+"\n"+
                "III. Be aware of what can be dangerous versus being paranoid."+"\n"+
                " IV. You will be given points for each correct answer. "+"\n"+
                "  V. Some wrong answers will get you killed. "+"\n"+
                " VI. If you survive, you need 80 points to win this game.");

        do {
            System.out.println('\n' + "What will your game name be?");
            userName = in.nextLine();
            System.out.println("Select what rank do you wish to play at?");
            System.out.println("Press '1' for Recruit:");
            System.out.println("Press '2' for Patrol:");
            System.out.println("Press '3' for Sergeant:");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3));

        if (temp == 1) {
            System.out.println(userName + ", Welcome to the police training scenarios. \nYou are now a police recruit " +
                    "about to go thru some training scenario. Good Luck!!!");
            return new Characters(userName, "recruit");
        } else if (temp == 2) {
            System.out.println(userName + ", Welcome back to the police training scenarios.");
            return new Characters(userName, "patrol");
        } else {
            System.out.println(userName + ", Your back for more?. May your experience help you.");
            return new Characters(userName, "sergeant");
        }
      }
}
