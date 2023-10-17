public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable() {
    }

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("thread Started with runnable -- " + name);
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s += i;
            System.out.println(s + " - " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("thread ended with runnable -- " + name);
    }
}
