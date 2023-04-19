package SkillStorm.Class_Work.week_03.Zoo_2_Abstraction_Casting;

public class Zoo {

    public static void main(String[] args) {

        sharkExhibit();
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   Demo Abstraction   ***************************************////
    ///////////////////////////////////////////////////////////////////////////////////

        public static void sharkExhibit() {

            System.out.println('\n' + "   ***   Mark - Hammerhead Shark   ***   ");
            Shark mark = new HammerHead("Mark", 18, 700, 20, 35);
                // Java only sees this as a "SHARK" add pulls hammerhead things through shark and only has access to the
                // shark methods. Java does not have access to hammerhead methods.
                    mark.bite();
                    mark.swim(200);
                    mark.hunt();

            // Casting - Telling Java, Mark is a hammerhead and now have access to specific hammerhead setter & getter methods.
                HammerHead actualMark = (HammerHead)mark;
                actualMark.setName("True Mark");
                System.out.println(actualMark.getBiteForce());
                actualMark.bite();
                actualMark.swim(200);
                actualMark.hunt();
                    mark.bite();
                    mark.swim(200);
                    mark.hunt();

            // Create Goblin
                System.out.println('\n' +  "   ***   Eddy - Goblin Shark   ***   ");
                Shark eddy = new Goblin("Eddy", 12, 10, 45);
                eddy.swim(9);
                eddy.bite();
                eddy.hunt();
            // Casting
                Goblin actualEddy = (Goblin)eddy;

            // Creating Blacktip
                System.out.println('\n' +  "   ***   Jimbo - Blacktip Shark   ***   ");
                BlackTip jimbo = new BlackTip("Jimbo", 5, 63, 17);
                jimbo.swim(75);
                jimbo.bite();
                jimbo.hunt();
            // Casting
                BlackTip actualJimbo = (BlackTip) jimbo;
                actualJimbo.swim(75);
                actualJimbo.bite();
                actualJimbo.hunt();
            // Creating an array
                Shark[] sharkList = new Shark[3];
                sharkList[0] = actualMark;
                sharkList[1] =actualEddy;
                sharkList[2] = actualJimbo;

                System.out.println("???????????????????????????????????????????????????????????????????????????");
                sharkBait(sharkList);

            // Checking if Jimbo is the same on all three versions of the name.
                Fish petFish = actualJimbo;

                System.out.println(petFish == actualJimbo);
                System.out.println(actualJimbo == jimbo);



        }

        private static void sharkBait(Shark[] sharks) {
        for (int i = 0; i < sharks.length; i++) {
            System.out.println(sharks[i].toString() + "***********************************");
            sharks[i].swim(320);
            System.out.println("There's bait int he water. Hoo HaHa!");
            sharks[i].hunt();
            }
        }
}