public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("main Thread started ");
        Thread currThread = Thread.currentThread();
        MyThread t1 = new MyThread("one");
        t1.start();
        MyThread t2 = new MyThread("two");
        t2.start();
        MyRunnable r1 = new MyRunnable("ONE");
        Thread t3 = new Thread(r1);
        t3.start();
        MyRunnable r2 = new MyRunnable("TWO");
        Thread t4 = new Thread(r2);
        t4.start();
        System.out.println(currThread);
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - " + currThread.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main thread ended");
    }
}