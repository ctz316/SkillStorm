package massive_Projects.Project_1.Calculations;

import massive_Projects.Project_1.Charactors.BankRobber;
import massive_Projects.Project_1.Charactors.PonziScheme;
import massive_Projects.Project_1.Charactors.Thief;
import massive_Projects.Project_1.Main;

import java.util.Scanner;

public class B_ChoosingCharacter extends Main {

    public static String gameName;

    public static void Choosingcharacter() {

        // Setting variable to be used in program
        Scanner in = new Scanner(System.in);
        String empty = null;
        String bag = empty;


        // Creating method to get username
        System.out.println("What is your user name going to be: ");
        gameName = in.nextLine();


        // Menu to choose which character
        int selection;
        do {
            System.out.println(gameName + ", What character would you like to play: ");
            System.out.println("1. Bank Robber - Aggressive Player");
            System.out.println("2. Ponzi Schemer - Savvy Player");
            System.out.println("3. Thief - Stealthy Player");
            selection = in.nextInt();
        } while ((selection != 1) && (selection != 2) && (selection != 3));

        // Actions for selection
        if (selection == 1) {
            BankRobber playerBR =  new BankRobber(gameName, 50.0, 10.0, 25.0, false, false, false, false, false,
                    false, false, false, false, false, false, "empty");
            System.out.println(gameName + ", You have chosen Bank Robber");
            System.out.println(playerBR);

        } else if (selection == 2) {
            PonziScheme playerPS =  new PonziScheme(gameName, 25.0, 50.0, 10.0, false, false, false, false, false,
                    false, false, false, false, false, false);
            System.out.println(gameName + ", You have chosen Ponzi Schemer");
            System.out.println(playerPS);

        } else {
            Thief playerT =  new Thief(gameName, 10.0, 25.0, 50.0, false, false, false, false, false,
                    false, false, false, false, false, false);
            System.out.println(gameName + ", You have chosen Thief");
            System.out.println(playerT);
        }
    }
}
