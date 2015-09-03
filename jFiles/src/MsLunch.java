public class MsLunch {
    private long c1 = 0;
    private long c2 = 0;
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    private Object nameList;

    public void inc1() {
        synchronized(lock1) {
            c1++;
        }
    }
    public void inc2() {
        synchronized(lock2) {
            c2++;
        }
    }
    public void addName(String name) {
    synchronized(this) {
        String lastName = name;
        int nameCount = 0;
        nameCount++;
    }
    nameList.equals(name);
    }
}
