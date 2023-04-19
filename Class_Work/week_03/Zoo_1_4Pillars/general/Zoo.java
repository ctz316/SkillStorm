package SkillStorm.Class_Work.week_03.Zoo_1_4Pillars.general;


import SkillStorm.Class_Work.week_03.Zoo_1_4Pillars.Beans.*;

public class Zoo {

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   Properties   *********************************************////
    ///////////////////////////////////////////////////////////////////////////////////
        // anything within your class that is not in your method is a property.
        // a Zoo HAS-A name
        // a Zoo HAS-A address
        // a Zoo HAS-A master zoologist

        public static String masterZoologist = "Kid";

        public String name; // instance variable
        public String address; // instance variable


    public static void main(String[] args) {

            buyTickets(4); // shows that it knows there is already a method in this class. Same as Zoo.buyTickets(4);

            // sellPopcorn(); // Cannot directly call non-static methods from inside a static method. Program loads static methods first.

            Zoo PhxZoo = new Zoo(); // call to our constructor -- OBJECT

            PhxZoo.sellPopcorn(); // with an instance of a class, you can call instance methods.

            Zoo nyZoo = new Zoo();
            nyZoo.sellPopcorn();

        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Demo Calls and behavior   ********************************////
        ///////////////////////////////////////////////////////////////////////////////////

            System.out.println("1, " + PhxZoo.masterZoologist);
            System.out.println("2, " + nyZoo.masterZoologist);
            System.out.println("3, " + masterZoologist);
            System.out.println("4, " + Zoo.masterZoologist);

            masterZoologist = "Dr. Kid";
            System.out.println("1, " + PhxZoo.masterZoologist);
            System.out.println("2, " + nyZoo.masterZoologist);
            System.out.println("3, " + masterZoologist);
            System.out.println("4, " + Zoo.masterZoologist);


                PhxZoo.name = "Phoenix Zoo";
                nyZoo.name = "New York Zoo";

                System.out.println(PhxZoo.name);
                System.out.println(nyZoo.name);

        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Demo cross package and classes   *************************////
        ///////////////////////////////////////////////////////////////////////////////////
//            // created with default constructor - errored out when setting constructor in Animal Class
//                Animal myAnimal = new Animal();
//                System.out.println(myAnimal);
//                myAnimal.name = "Dan"; // Can do because it's public
//                myAnimal.color = "Grey";
//                myAnimal.age = 53;
//                // myAnimal.fur = false; // Can not do as it's private

        Animal Animal = new Animal("Mark", "Blue", 15, true);
        System.out.println(Animal);

        ///////////////////////////////////////////////////////////////////////////////////
        ////**************   Using Getter   *******************************************////
        ///////////////////////////////////////////////////////////////////////////////////
//                myAnimal.setFur(true);
//                System.out.println(myAnimal.isFur());


        PhxZoo.birdExhibit();
    }



    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   Demo static   ********************************************////
    ///////////////////////////////////////////////////////////////////////////////////
        public static void buyTickets(int num) {
            double amount = num * (34.95 * 1.087);
            System.out.println(String.format("That will be $%.2f", amount));
        }

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   Demo non-static   ****************************************////
    ///////////////////////////////////////////////////////////////////////////////////
        public void birdExhibit() {
            Bird larry = new Bird("Larry", "Red", true, true, 88);
                larry.feed(20);
                larry.flap(15);
                larry.speak();

            Ostrich steve = new Ostrich(); // used stuff from Bird through Ostrich INHERITANCE
                steve.setName("Steve");
                steve.setColor("Brown");
                steve.setTopSpeed(45);
                steve.setCarnivore(true);
                steve.setFly(false);
                steve.feed(60.5);
                steve.flap(3);
                steve.speak();
                steve.hide(10);  // Inheritance only goes 1 way
                steve.migrate();


            Eagle Tyrone = new Eagle("Tyrone", "Golden", true, true, 75);
                Tyrone.feed(100);
                Tyrone.flap(16);
                Tyrone.speak();

            Penguin michael = new Penguin("Michael", "White", true, false, 150);
                michael.feed(53.2);
                michael.flap(32);
                michael.speak();
                michael.dance();
                michael.slide(20);
                michael.migrate();

            BaldEagle baldilocks = new BaldEagle();
                baldilocks.setName("baldilocks");
                baldilocks.setColor("Blonde");
                baldilocks.setCarnivore(true);
                baldilocks.setFly(true);
                baldilocks.setTopSpeed(276);
                baldilocks.flap(40);
                baldilocks.feed(24.6);
                baldilocks.migrate();
                baldilocks.speak();

            Bird[] birds = new Bird[5];
            birds[0] = Tyrone;
            birds[1] = baldilocks;
            birds[2] = michael;
            birds[3] = steve;
            birds[4] = Tyrone;
            viewBirds(birds);

        }


        private void viewBirds(Bird[] birds) {
            for (int i = 0; i < birds.length; i++) {
                System.out.println("*************" + birds[i].getName() + "****************************");
                birds[i].feed (20);
                birds[i].flap(15);
                birds[i].speak();
                birds[i].migrate();
            }
        }

    ////**************  Demo static 2   *******************************************////
    ///////////////////////////////////////////////////////////////////////////////////
        // This is an instance method, it exists on an instance of a Zoo.
        public void sellPopcorn() {
            System.out.println("Popcorn! Get you're popcorn here!");
            System.out.println("Don't feed the animals!");
        }

}
