package Class_Work.Week_06_LinkedLists.Generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class FoundationsLinkedListGenericClasses {

    public static void main(String[] args) {
        //staticStuff();
        //lickedList();
        //customLinkedList();
        //genericClass();
        genericClass2();

    }




    ///////////////////////////////////////////////////////////////////////////////////
    ////***   Creating LinkedLists working with under the hood methods we created  ////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void customLinkedList() {
        MyLinkedLists<Integer> myList = new MyLinkedLists<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.print();
        System.out.println("size: " + myList.getSize());
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************      ***********************************************////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void staticStuff() {
        Vehicle car1 = new Sedan(); // Reference to vehicle
        Sedan car2 = new Sedan("Black", "Honda", "Civic");// Reference to Sedan

        car1.honk(); // Instance methods look at underlying type
        car2.honk();

        car1.drive(); // static methods look at reference type
        car2.drive();
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   LinkedLists using built in methods   *********************////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void lickedList() {
        ArrayList<Sedan> carsAL = new ArrayList<>();
        LinkedList<Sedan> carsLL = new LinkedList<>();

        carsAL.add(new Sedan());
        carsAL.add(new Sedan("Black", "Honda", "Civic"));
        carsAL.add(new Sedan("Grey", "Toyota", "Corolla"));

        carsLL.add(new Sedan());
        carsLL.add(new Sedan("Black", "Honda", "Civic"));
        carsLL.add(new Sedan("Grey", "Toyota", "Corolla"));

        System.out.println(carsAL);
        System.out.println(carsLL);
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////***   Same constructor with generic   *************************************////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void genericClass() {
        MyGeneric<String> myValue = new MyGeneric<String>("Kid");
        System.out.println(myValue.getA());
        MyGeneric<Integer> myValue2 = new MyGeneric<Integer>(47);
        System.out.println(myValue2.getA());

        ArrayList<String> names = new ArrayList<>();
        MyGeneric<ArrayList<String>> myList = new MyGeneric<ArrayList<String>>(names);
        names.add("David");
        names.add("Andy");
        names.add("Goliath");
        System.out.println(myList.getA());
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////***   Same constructor with 2 generics   **********************************////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void genericClass2() {

        MyGeneric2<String, Integer> otherValue = new MyGeneric2<String, Integer>("Kid", 47);
        System.out.println("Name: " + otherValue.getA());
        System.out.println("Age: " + otherValue.getB());

        MyGeneric2<String, String> otherValue2 = new MyGeneric2<String, String>("Kid", "Barker");
        System.out.println("Full Name: " + otherValue2.getA() + " " + otherValue2.getB());

    }
}
