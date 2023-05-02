package SkillStorm.Class_Work.week_09_Threading;

public class Threads {
    public static void main(String[] args) {

        threading(); // Multi-Threading
    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////**************   Multi-Threading   ****************************************////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void threading() {

//        Thread states:
//            new             :   Thread was created
//            runnable        :   thread is running or ready to run
//            waiting         :   anytime you tell a thread to wait, this state releases any locks
//            timed waiting   :   anytime you tell a thread to wait an amout of time, this state WILL NOT releases any locks
//            terminated      :   the thread is finished or program has crashed
//            blocked         :   it tried to access a resource but told to wait

        // Making a thread
        Thread t1 = new Thread(() -> {
            for ( int i = 0; i < 3; i++){
                System.out.println("Thread 1 has looped "  + (i+ 1) + " times.");
            }
        }, "Carl"); // You can name the thread
        Thread t2 = new Thread(() -> {
            for ( int i = 0; i < 3; i++){
                System.out.println("Thread 2 has looped "  + (i+ 1) + " times.");
            }
        });
        Thread t3 = new Thread(() -> {
            for ( int i = 0; i < 3; i++){
                System.out.println("Thread 3 has looped "  + (i+ 1) + " times.");
            }
        });
        // Different way to create a thread.
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread 4 has looped " + (i + 1) + " times.");
                }
            }
        });

        // Starting the thread to run the job - threads run in background and not in the order that it's in the file.
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("I'm in main # 1."); // Does not wait for thread to finish. Could end up anywhere.

        // Stopping thread to get memory back. Always close.
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("I'm in main # 2."); // Threads are stop will run at the end.
    }
}
