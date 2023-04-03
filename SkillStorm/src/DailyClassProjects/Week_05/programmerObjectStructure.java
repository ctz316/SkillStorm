//package DailyClassProjects.Week_05;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ProgrammerObjectStructure {
//
//
//        // Creating variables
//        private String name;
//        private String company;
//        private ArrayList<String> languages = new ArrayList<>();
//
//        // Constructors
//        public ProgrammerObjectStructure(String name, String company, ArrayList<String> languages) {
//            this.name = name;
//            this.company = company;
//            this.languages = languages;
//        }
//
//        // Getting info
//        public ProgrammerObjectStructure(Scanner in) {
//
//            // variables
//            String tName = null;
//            String tCompany = null;
//            int numOfLanguages = 0;
//            ArrayList<String> tempLanguages = new ArrayList<>();;
//            String tempLang;
//            int counter = 0;
//
//            // Getting Info from user
//            do {
//                System.out.println("What is your name? ");
//                name = in.nextLine();
//            } while (tName != null);
//
//            do {
//                System.out.println("What company do you work for? ");
//                company = in.nextLine();
//            } while (tCompany.trim() != null);
//
//            do {
//                System.out.println("How many programming languages do you know? ");
//                numOfLanguages = in.nextInt();
//            } while (numOfLanguages <= 0);
//
//            for (int i = 0; i < (numOfLanguages - 1); i++) {
//                do {
//                    System.out.println(counter++ + "What is the programming language?");
//                    tempLang = in.nextLine();
//                } while (tempLang != null);
//                languages.add(tempLang);
//            }
//
//            // Creating Object from user input
//            return new ProgrammerObjectStructure(name, company, tempLanguages<>);
//        }
//
//
//    // Methods
//        @Override
//        public String toString () {
//            return
//                    "               **********   Programmer   **********   " + '\n' +
//                    "                       Name: " + name + '\n' +
//                    "                    Company: " + company + '\n' +
//                    "Programming Languages known: " ;
//        }
//
//
//
//    // Getters and Setters
//    public String getName () {
//        return name;
//    }
//    public void setName (String name){
//        this.name = name;
//    }
//    public String getCompany () {
//        return company;
//    }
//    public void setCompany(String company) {
//        this.company = company;
//    }
//    public ArrayList<String> getLanguages() {
//        return languages;
//    }
//    public void setLanguages(ArrayList<String> languages) {
//        this.languages = languages;
//    }
//}
