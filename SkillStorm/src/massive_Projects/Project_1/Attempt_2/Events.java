package massive_Projects.Project_1.Attempt_2;

import java.util.Scanner;

public class Events {

    // Variables
    private String userName;
    private String recruit;
    private String patrol;
    private String sergeant;

        Scanner in = new Scanner(System.in);

      void openingGreeting(Scanner in) {

          int temp;

        System.out.println("***   Welcome to the police recruit Game   ***" + "\n"+
                "The object of this game is to enforce the law while surviving. "+"\n"+
                "Here are some tips you will need to finish the game."+"\n"+
                "\n"+
                "  I. You will need to think about what is a crime and what is not."+"\n"+
                " II. Be aware of what can be dangerous versus being paranoid."+"\n"+
                "III. You will be given points for each correct answer. "+"\n"+
                " IV. The total points will determine if you win or lose the game."+"\n");

        do {
            System.out.println("\n" + "What will your game name be?");
            userName = in.nextLine();
            System.out.println("\n" + "Select what rank do you wish to play at?");
            System.out.println("\n" + "Press 1 for Recruit");
            System.out.println("\n" + "Press 2 for Patrol");
            System.out.println("\n" + "Press 3 for Sergeant");
            temp = in.nextInt();
        } while ((temp != 1) && (temp != 2) && (temp != 3));

        if (temp == 1) {
            Charactors
        } else if (temp == 2) {

        } else {

        }
    }


    public class DrunkInAZ(Scanner in) {
        System.out.println("\n"+")
    }
    public class RidingHorseDrunk(Scanner in) {
        System.out.println("\n"+")
    }
    public class Speeder(Scanner in) {
        System.out.println("\n"+")
    }
    public class DomesticDisturbance(Scanner in) {
        System.out.println("\n"+")
    }
    public class EmotionalDisturbedPerson(Scanner in) {
        System.out.println("\n"+")
    }


}
