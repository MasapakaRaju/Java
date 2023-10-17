public class TestThread {
    public static void main(String[] args) {
        thread a = new thread("A");
        thread b = new thread("B");
        b.start();
        a.start();
    }
}
