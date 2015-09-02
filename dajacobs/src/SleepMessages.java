public class SleepMessages {
    public static void main(String args[]) throws InterruptedException {
        String importantInfo[] = {
            "Mares eats oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
        for (String importantInfo1 : importantInfo) {
            // Pause for 4 seconds
            Thread.sleep(4000);
            // Print a message
            System.out.println(importantInfo1);
        }
        for (String importantInfo1 : importantInfo) {
            // Pause for 4 seconds
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // We've been interrupted: no more messages.
                return;
            }
            // Print a message
            System.out.println(importantInfo1);
        }
    }
}