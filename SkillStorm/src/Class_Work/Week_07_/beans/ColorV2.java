package Class_Work.Week_07_.beans;

public enum ColorV2 {

    //****************************************************************************************************************
    //****************************************Everything is static****************************************************
    //****************************************************************************************************************

    BLUE("Blue"),       // Define first
    RED("2"),         // Define first
    GREEN("Green"),     // Define first
    BLACK("Black"),     // Define first
    WHITE("White"),     // Define first
    ORANGE("Orange"),   // Define first
    TAN("Tan"),         // Define first
    SILVER("Silver"),   // Define first
    YELLOW("Yellow");   // Define first

    // in Java ENUM'S ARE ESSENTIALLY CLASSES.
    // Generally don't use them this way, but offers a lot of customization

    private final String color;

    //Constructor
    ColorV2(String color) {
        this.color = color;
    }

    private String color() {
        return color;
    }

    // Method

    ColorV2(int val) {
        this.color = "Red";
    }
    String superIT() {
        return "Super " + this.color;
    }


    public static void main(String[] args) {
        for (ColorV2 c : ColorV2.values()) {
            System.out.println(c + " ~> "+ c.superIT());
        }
    }

}
