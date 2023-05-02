package SkillStorm.DailyProjects.Week_09;

import java.util.Scanner;

public class ThreadedSum implements Runnable {
    private static int start;
    private static int end;
    private final boolean even;
    private int sum;

    // Constructor
    public ThreadedSum(int start, int end, boolean even) {
        ThreadedSum.start = start;
        ThreadedSum.end = end;
        this.even = even;
        this.sum = 0;
    }

    public static void main(String[] args) throws InterruptedException {

        // Start Scanner
        Scanner input = new Scanner(System.in);

        // Get user input for start and end variables
        do {
            System.out.print("Please enter a positive number as the starting point: ");
            int start = input.nextInt();
        } while (start < 0 );

        do {
            System.out.print("Please enter a positive number larger than the starting point: ");
            int end = input.nextInt();
        } while (end < start);

        // Creating objects to separate the counts from odd and even easier
        ThreadedSum evenThread = new ThreadedSum(start, end, true);
        ThreadedSum oddThread = new ThreadedSum(start, end, false);

        // Creating threads
        Thread t1 = new Thread(evenThread);
        Thread t2 = new Thread(oddThread);

        // starting threads
        t1.start();
        t2.start();

        // stopping the threads to regain the memory being used.
        t1.join();
        t2.join();

        // Getting total count to a variable to display
        int totalSum = evenThread.sum + oddThread.sum;

        //Printing totals
        System.out.printf("The sum of the odds is: %d", oddThread.sum);
        System.out.printf('\n' + "The sum of the evens is: %d", evenThread.sum);
        System.out.printf('\n' + "The total sum is %d.", totalSum);
    }

    // Override the run method
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (even && i % 2 == 0) {
                sum += i;
            } else if (!even && i % 2 != 0) {
                sum += i;
            }
        }
    }
}