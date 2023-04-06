package DailyProjects.Week_05;

//import DailyClassProjects.Week_05.ProgrammerObjectStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Programmer {

    // Creating variables
    private String name;
    private String company;
    private ArrayList<String> languages = new ArrayList<>();

    public static <Static> void main(String[] args) {


        // Open scanner to pass around
        Scanner in = new Scanner(System.in);

        // variables
        int addRemove;

        // Getting Info from user
        do {
            System.out.println("Do you wish to add a person or remove a language from someone? ");
            System.out.println("Press '1' to add and '2' to remove language. ");
            addRemove = in.nextInt();
        } while ((addRemove != 1) && (addRemove != 2));

        if (addRemove == 1) {
            addCoder(in);
        }


        }


        // Constructors
        public Programmer(String name, String company, ArrayList<String> languages) {
            this.name = name;
            this.company = company;
            this.languages = languages;
        }

        // Methods
        public static void addCoder(Scanner in) {
            String tName = null;
            String tCompany = null;
            int numOfLanguages = 0;
            ArrayList<String> tempLanguages = new ArrayList<>();
            ;
            String tempLang;
            int counter = 0;
            do {
                System.out.println("What is your name? ");
                tName = in.nextLine();
            } while (tName == null);

            do {
                System.out.println("What company do you work for? ");
                tCompany = in.nextLine();
            } while (tCompany == null);

            do {
                System.out.println("How many programming languages do you know? ");
                numOfLanguages = in.nextInt();
                in.nextLine();
            } while (numOfLanguages <= 0);

            for (int i = 0; i < (numOfLanguages); i++) {
                do {
                    System.out.println((counter++ + 1) + ") What is the programming language?");
                    tempLang = in.nextLine();
                } while (tempLang == null);
                tempLanguages.add(tempLang);
        }

        // Creating Object from user input
        Programmer coder = new Programmer(tName, tCompany, tempLanguages);
        System.out.println(coder);
        }

        @Override
        public String toString () {
            return
                    "               **********   Programmer   **********   " + '\n' +
                            "                       Name: " + name + '\n' +
                            "                    Company: " + company + '\n' +
                            "Programming Languages known: " + languages;
        }

        // Getters and Setters
        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public String getCompany () {
            return company;
        }
        public void setCompany(String company) {
            this.company = company;
        }
    }
