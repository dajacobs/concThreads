package src;

import java.util.Random;

public class Consumer implements Runnable {
    private Drop drop;

    Consumer(Drop drop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void run() {
        Random random = new Random();
        for(String message = drop.take();
            ! message.equals("DONE");
            message = drop.take()) {
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
    }
}