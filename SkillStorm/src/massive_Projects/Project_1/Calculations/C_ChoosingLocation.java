package massive_Projects.Project_1.Calculations;

import massive_Projects.Project_1.Main;

import java.util.Scanner;

public class C_ChoosingLocation extends Main {

    public static void ChoosingLocation() {

        // Setting variable to be used in program
        Scanner in = new Scanner(System.in);
        String book = "book";
        String cigarettes = "cigarettes";
        String toiletpaper = "toiletpaper";

        // Choosing option while checking for wrong option selection

        int selection;
        do {
            System.out.println('\n' + "You are currently in your cell. Around you, You see a book, cigarettes and toilet " +
                    "paper." + "You have the choice to pick an item up, start digging or to explore another location. " +
                    "What would you like to do?");
            System.out.println("Enter a number:");
            System.out.println(1 + ". Pick up an item");
            System.out.println(2 + ". Explore another location");
            System.out.println(3 + ". Start digging");
            System.out.println(4 + ". Tell the guard that you have a medical emergency");
            selection = in.nextInt();
        } while ((selection != 1) && (selection != 2) && (selection != 3) && (selection != 4));

        if (selection == 1) {
            do {
                System.out.println('\n' + "What would you like to pick up?");
                System.out.println("You only carry the last item you pick up.");
                System.out.println("Please, Enter a number:");
                System.out.println(1 + ". Get a book called 'War and Peace'");
                System.out.println(2 + ". Get the cigarettes");
                System.out.println(3 + ". Get the toilet Paper");
                selection = in.nextInt();
            } while ((selection != 1) && (selection != 2) && (selection != 3));
            if (selection == 1) {
                setBag() = "book";
                System.out.println("You have picked up the book as your 1 item. ");
                ChoosingLocation();
            } else if (selection == 2) {
                setBag = "cigarettes";
                System.out.println("You have picked up the cigarettes as your 1 item. ");
                ChoosingLocation();
            } else {
                setBag = "toiletpaper";
                System.out.println("You have picked up the cigarettes as your 1 item. ");
                ChoosingLocation();
            }
        } else if (selection == 2) {

        } else if (selection == 3) {

        } else {

        }
    }
}