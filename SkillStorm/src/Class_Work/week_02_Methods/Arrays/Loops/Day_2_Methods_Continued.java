package Class_Work.week_02_Methods.Arrays.Loops;
        ///////////////////////////////////////////////////////////////////////////////////
        ////**********************   Method 1   ***************************************////
        ///////////////////////////////////////////////////////////////////////////////////

            // A class can have multiple methods with the same name.
            // Overloaded methods must have a different number or type of parameters
            // Methods need return type.
            // Only 1 return type for return

public class Day_2_Methods_Continued {
    public static void main(String[] args) {

        System.out.println("Day 2, all about overloading");

            // Same methods but with different parameters.
        System.out.println("01. " + (getCookie()));
        System.out.println("02. " + getCookie(40));
        System.out.println("03. " + getCookie(40.0));
        System.out.println("04. " + getCookie(6, "Snickerdoodle"));
        System.out.println(("05. " + "You get ") + getCookie("Oatmeal") + " Cookies!");
        System.out.println(("06. " + "You get ") + getCookie("M&M") + " Cookies!");
        System.out.println(("07. " + "You get ") + getCookie("Sugar") + " Cookies!");
        System.out.println("08. " + getCookie(getCookie("Chocolate Chip"), getCookie("Salted Caramel")));
        System.out.println("09. " + getCookie(getCookie("09. " + "Sugar"), 2.75));
        System.out.println("10. " + "You ran " + Math.floor(getCookie(0.5, 96)) + " miles to work off those cookies");
    }
//                ***** Method Overloading ***** -Same name
        ///// 01 /////
    public static String getCookie() {
        return "Chocolate Chip";
    }

    ///// 02 /////
    public static String getCookie(int num) {
        return "Chocolate Chip x " + num;
    }

    ///// 04 /////
    public static String getCookie(int num, String type) {
        return type + " cookies x " + num;
    }

    ///// 03 /////
    public static String getCookie(double num) {
        return "Sharing " + num + " Sugar cookies";
    }

    ///// 05 , 06 , 07 /////
    public static int getCookie (String type) {
        if (type.equalsIgnoreCase("Chocolate Chip") ||
                type.equalsIgnoreCase("Sugar")) {
            return 42;
        } else if (type.equalsIgnoreCase("Oatmeal")) {
            return 23;
        } else if (type.equalsIgnoreCase("Peanut Butter") ||
                type.equalsIgnoreCase("Raisin")) {
            return 7;
        } else {
            return 12;
        }
    }

    ///// 08 /////
    public static String getCookie ( int num, int num2){
        return "You ate " + (num + num2) + " cookies!";
    }

    ///// 09 /////
    public static String getCookie ( int num1, double num2){
        double tax = 0.06;
        double price = (num1 * num2) * (1 + tax );
        return String.format("You ate %d cookies @ $%.2f each for a total of $%.2f", num1, num2, price);
    }
        // ???????????????????????????????????????????????????????????????????????????????????????????????
        // ?????????????????????  ^^^^^ RESEARCH AND LEARN STRING.FORMAT ^^^^^  ??????????????????????????
        // ???????????????????????????????????????????????????????????????????????????????????????????????

    ///// 10 /////
    public static double getCookie(double distance, int cookies) {
        return distance * cookies + distance / (cookies /4);
    }
}
