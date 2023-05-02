package SkillStorm.DailyProjects.Week_10_.ProducerConsumerExercise;

public class CaliforniaHouse {

    private Object mutex = new Object();
    private int availableEnergy;
    public int houseIdentifier;

    public CaliforniaHouse(int houseIdentifier) {
        this.houseIdentifier = houseIdentifier;
        this.availableEnergy = 0;
    }

    public void energy(int electricity) {
        synchronized (mutex) {
            System.out.println(" The generator has produced " + electricity + " MegaWatts of electricity today.");

            // Critical section
            availableEnergy += electricity;

            mutex.notifyAll();
        }
    }

    public void houseNeeds(int electricity) {
        synchronized (mutex) {

            // if electricity not available, thread needs to wait in critical section.
            while (availableEnergy < electricity) {
                System.out.println(this.toString() + " IS CURRENTLY SUFFERING A BROWN OUT...");

                try {
                    mutex.wait(); // Tells thread to release lock and wait and when wakes up, it will re-grab lock.
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            System.out.println(this.toString() + " used " + electricity + " KiloWatts of energy today.");

            availableEnergy -= electricity;
            mutex.notifyAll();
        }
    }

    public String toString() {
        return "California House " + Thread.currentThread();
//        return "California House " + houseIdentifier;
    }
}
