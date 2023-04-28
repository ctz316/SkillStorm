package SkillStorm.Class_Work.week_09_Threading;

public class Threads {
    public static void main(String[] args) {

        threading(); // Multi-Threading
    }



    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   Multi-Threading   ****************************************////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void threading() {

        // Making a thread
        Thread t1 = new Thread(() -> System.out.println("I'm a thread!"));

        t1.start();
    }
}
