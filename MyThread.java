public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("new thread started = " + getName());
        for (int i = 5; i > 0; i--) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("new thread ended -- " + getName());
    }

}
