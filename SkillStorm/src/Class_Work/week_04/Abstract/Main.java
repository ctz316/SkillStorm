package Class_Work.week_04.Abstract;

public class Main {

    public static void main(String[] args) {

        //rideBike();
        polymorphism();

    }

    public static void polymorphism() { // Overrides and overloads are all parts of Polymorphism
        Vehicle bike1 = new Sport("Suzuki", "Hayabusa", "Black", 180, "Medium", false);
        Vehicle bike2 = new GrandTouring("Suzuki", "Boulevard C50T", "White", 110, "Small", false);
        bike1.drive(); // same call but 2 different versions
        bike2.drive(); // same call but 2 different versions

        Sport sportBike = (Sport) bike1; //  <~~~~ Casting
        sportBike.drive(4);

        GrandTouring touringBike  = new GrandTouring("Suzuki", "Boulevard C50T", "White", 110, "Small", false);

        Vehicle[] myBikes = new Vehicle[4];
        myBikes[0] = bike1;
        myBikes[1] = bike2;
        myBikes[2] = sportBike;
        myBikes[3] = touringBike;

        for (int i = 0; i < myBikes.length; i++) {
            System.out.println("***********");

            //System.out.println(myBikes[i] instanceof Sport); // Looking for class, returns true/false
            // .equal is better but this is still looking at memory
        for (int j = myBikes.length -1; j > -1; j--) {
            System.out.println("Index: " + i + " " + myBikes[i].getClass());
            System.out.println("Index: " + j + " " + myBikes[j].getClass());
            if (myBikes[i].equals(myBikes[j])) {
                System.out.println("Same bike");
            } else {
                System.out.println("Different bike");
            }
            System.out.println();
        }
        }
    }


    public static void rideBike() {
        Vehicle myBike = new GrandTouring("Ducati", "Monster", "Red", 190, "Small", false);
        System.out.println(myBike);
            myBike.drive();
            myBike.park();
            myBike.honk();

        Vehicle myOtherBike = new GrandTouring("Harley Davidson", "Tri-Glide Ultra", "Burnt Orange", 120, "Large", true);
        System.out.println(myOtherBike);
            myOtherBike.drive();
            myOtherBike.park();
            myOtherBike.honk();

        Motorcycle myThirdBike = new Sport("Triumph", "Daytona", "Blue", 194, "Medium", false);
        System.out.println(myThirdBike);
            myThirdBike.drive();
            myThirdBike.park();
            myThirdBike.honk();
    }
}