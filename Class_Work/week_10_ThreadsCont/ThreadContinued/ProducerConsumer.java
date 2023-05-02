package SkillStorm.Class_Work.week_10_ThreadsCont.ThreadContinued;

public class ProducerConsumer {

        private Object mutex = new Object();
        private int availableData;

    public ProducerConsumer() {
        this.availableData = 0;
    }

    public void produce(int data) {
        synchronized (mutex) {
            System.out.println(Thread.currentThread() + " is producing " + data);

            // Critical section
            availableData += data;

            mutex.notifyAll();
        }
    }
    //*********************************************************************************
    //// Need to understand that the consumer may need a higher number than producer
    //// produced,so will need to wait for an additional loop to get the needed amount
    //// putting the consumer behind an iteration.
    //*********************************************************************************
    public void consume(int data) {
        synchronized (mutex) {
            System.out.println(Thread.currentThread() + " wants to consume " + data);

            // if data not available, thread needs to wait in critical section.
            while (availableData < data) {
                System.out.println(Thread.currentThread() + " is waiting to consume.");

                try {
                    mutex.wait(); // Tells thread to release lock and wait and when wakes up, it will re-grab lock.
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println(Thread.currentThread() + " woke up.");
            }

            System.out.println(Thread.currentThread() + " consumed " + data);

            availableData -= data;
        }
    }
}