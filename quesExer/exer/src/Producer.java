import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<String> drop;
    public Producer(BlockingQueue<String> drop) {
        this.drop = drop;
    }
    @Override
    public void run() {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
        Random random = new Random();

        try {
            for (String importantInfo1 : importantInfo) {
                drop.put(importantInfo1);
                Thread.sleep(random.nextInt(5000));
            }
            drop.put("DONE");
        } catch (InterruptedException e) {}
    }
}