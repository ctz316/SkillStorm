package Class_Work.Week_05_ArrayLists.Beans;

public class Sedan extends Vehicle {

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   All 3 ways work    ***************************************////
    ///////////////////////////////////////////////////////////////////////////////////
    //Java always uses "Super()" keyword in your constructor
    public Sedan() {
        //super ("Toyota", "Supra", "Blue");
        this("Nissan","Altima","Blue" );
    }

    public Sedan(String model, String make, String color) {
        super (make, model, color); // I need to call a valid parent constructor
    }

}
