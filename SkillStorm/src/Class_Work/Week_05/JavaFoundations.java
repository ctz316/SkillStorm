package Class_Work.Week_05;

public class JavaFoundations {

    public static void main(String[] args) {

        switchStatement();

    }

    public static void switchStatement() {

        String guardianClass = "Titan";

        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Switch statements    *************************************////
        ///////////////////////////////////////////////////////////////////////////////////
        switch(guardianClass.toLowerCase()) { // Only way to ignore capitalization
            case "hunter":
                System.out.println("Great Choice!");
                break;
            case "warlock":
                System.out.println("Eww");
                break;
            case "titan":
                System.out.println("Double Eww");
                break;
            default:
                System.out.println("You're no guardian I know");
            }

    }
}
