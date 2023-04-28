package SkillStorm.Class_Work.Week_08_StacksFileReading;

public class test {

    public class MyCounter extends Thread {

        /*
         * Make a branch
         * Implement this run method
         *
         * What does run do?
         *  It counts from 0 to any number of your choosing
         *  It counts by any increment of your choosing
         *  It prints the number out when it's finished
         *
         * I want you to merge your method into the main branch
         * Upload the file you have locally after you merge it
         * add a comment with your name next to your loop in the run method
         *
         * While mergeing DO NOT overrite someone else's code
         */


        @Override
        public void run() {
            // Kyle Cook
            for(int i = 0; i < 22; i+=3) {
                System.out.print(i + "$");
            }
            // Andy Challman
            for(int i = 0; i < 46; i+=4) {
                System.out.print(i + " :Andy's Version");
            }
            int count = 0;

            for(int i = 0; i < 7 ; i++) {//Ernesto Higuera
                count++;
            }
            System.out.println(count);

            // Kid Barker
            for(int i = 0; i < 3; i++) {
                System.out.print("Kid");
            }
        }
    }
}
