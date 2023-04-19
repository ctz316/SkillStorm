package SkillStorm.Class_Work.week_04;

import SkillStorm.Class_Work.week_04.Abstract.Sport;

import java.util.Random;

public class Random_and_Hitting_Exceptions {

    public static void main(String[] args) {

        //sporttest();
        //randomization();
        //Error_Exceptions();
        //Error_Exceptions_2();

    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////*****************      *****************////
    ///////////////////////////////////////////////////////////////////////////////////
        public static void sporttest() {

            Sport bike = new Sport("Suzuki", "Hybusa", "Blue", 200, "Medium", true);
            System.out.println(bike);

            bike.setColor("Red");// Inside "Main" I can change properties.
            System.out.println(bike);

            int x = 37;
            System.out.println(x);
            x = 42;
            System.out.println(x);
            changeX(x);
            System.out.println(x);
            changeBike(bike);
        }

    ///////////////////////////////////////////////////////////////////////////////////
    ////*****************      *****************////
    ///////////////////////////////////////////////////////////////////////////////////
        public static void changeX(int val) { // val only exists in this method. after method ends it disappears
            System.out.println(val);

            val = 46;
            System.out.println(val);
        }

    ///////////////////////////////////////////////////////////////////////////////////
    ////*****************      *****************////
    ///////////////////////////////////////////////////////////////////////////////////
        public static void changeBike(Sport bike) { // objects can be changed
            System.out.println(bike);

            bike.setColor("Green");
            System.out.println(bike);
        }

    public static void randomization() {

        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Math.random   *****************************************////
        ///////////////////////////////////////////////////////////////////////////////////
            System.out.println("   ***   Random Math   ***   ");
            for (int i = 0; i < 10; i++) {
                System.out.println(Math.random()); // always returns a double < 0.0 to 1.0 > - pseudo random
            }

            System.out.println("   ***   Random Math within a certain range   ***   ");
            for (int i = 0; i < 10; i++) {
                System.out.println(Math.random() * (120 - 30) + 30); //  <~~~~ Gets numbers that range from 30 to 120 - (High - Low) + Low
            }

        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Random Class   ****************************************////
        ///////////////////////////////////////////////////////////////////////////////////
            System.out.println("   ***   Math Class   ***   ");
            Random rand = new Random(); //    <~~~ inside the () is the SEED value
            for (int i = 0; i < 10; i++) {
                rand.nextInt();
                System.out.println(rand.nextInt()); // Can return what ever you chose after .
            }

            System.out.println("   ***   Math Class within a certain range   ***   ");
            for (int i = 0; i < 10; i++) {
                rand.nextInt();
                System.out.println(rand.nextInt(120 + 1 - 30) + 30);  // for range still needs to be told
                                                                            // (High + 1 - Low) + Low
            }

            System.out.println("   ***   Math Class with Double within a certain range   ***   ");
            for (int i = 0; i < 10; i++) {
                rand.nextDouble();
                System.out.println(rand.nextDouble() * (120 - 30) + 30);    // for range with double still needs to be
                                                                            // told (High - Low) + Low
            }
    }
        ///////////////////////////////////////////////////////////////////////////////////
        ////*****************   Exceptions   ******************************************////
        ///////////////////////////////////////////////////////////////////////////////////
            public static void Error_Exceptions() {
                // 'EXCEPTION" is some unforeseen event happened that Java does not know how to recover from. This happens while compiling or
                // running, you can recover but need to tell Java how

                // "ERROR" is catastrophic failure that can not be recovered from.
                    int var = 0;
                    int result = 5/var;  // Throws exception ~~~> ArithmeticException: / by zero <~~~~ shows CALL STACK (the
                                         // process that lead to error)
            }
            public static void Error_Exceptions_2() {
                int[] nums = { 2, 3, 5, 6 };
                nums[5] = 7;
            }
}