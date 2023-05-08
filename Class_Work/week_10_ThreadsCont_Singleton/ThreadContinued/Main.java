package SkillStorm.Class_Work.week_10_ThreadsCont_Singleton.ThreadContinued;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        ProducerConsumer pcExample = new ProducerConsumer();

        Thread producer = new Thread(() -> {
            int data;

            try {
                for ( int i = 0; i < 5; i++) {
                    data = rand.nextInt(51 - 20) + 20;
                    pcExample.produce(data);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            int data;

            try {
                for ( int i = 0; i < 4; i++) {  // *** Needed less than producer to finish successfully.
                    data = rand.nextInt(51 - 20) + 51;
                    pcExample.consume(data);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
