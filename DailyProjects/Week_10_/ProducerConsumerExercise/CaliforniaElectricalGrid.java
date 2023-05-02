package SkillStorm.DailyProjects.Week_10_.ProducerConsumerExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CaliforniaElectricalGrid {

    public static void main(String[] args) {

        Random rand = new Random();
        CaliforniaHouse house1 = new CaliforniaHouse(1);
        List<Thread> tasks = new ArrayList<>();

    Thread generator = new Thread(() -> {
        int energy;

        try {
            for ( int i = 0; i < 5; i++) {
                energy = rand.nextInt(101 - 50) + 50;
                house1.energy(energy);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    });

    for (int j = 0; j < 5; j++) {
        Thread houseNeeds = new Thread(() -> {
            int energy;

            try {
                for (int i = 0; i < 4; i++) {
                    energy = rand.nextInt(31 - 20) + 20;
                    house1.houseNeeds(energy);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
        tasks.add(houseNeeds);
    }

        generator.start();
    for (Thread houseNeeds : tasks) {
        houseNeeds.start();
    }

        try {
            for (Thread houseNeeds : tasks) {
                houseNeeds.join();
            }
            generator.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

}
}
