package app;

public class SimpleThreads {
    /** Display a message, preceded by
     *  the name of the current thread
     **/
    static void threadMessages(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }
}
private static class MessageLoop implements Runnable {
    public void run() {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
    }
}
