public class thread implements Runnable {
    private Thread t;
    private String threadName;

    thread(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(threadName);
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
