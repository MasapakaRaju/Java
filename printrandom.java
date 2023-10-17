public class printrandom {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = extracted();
            System.out.println(num);
        }
    }

    private static int extracted() {
        int num = (int) (Math.random() * 100);
        return num;
    }
}
