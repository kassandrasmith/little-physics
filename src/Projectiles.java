public class Projectiles {

    public static int fireAll(int n) {
        System.out.println(n);
        n = 1000;
        return 10;
    }

    public static void main(String[] args) {
        boolean h = true;
        int n = 100;
        int c = 15;
        int[] i = new int[10];
        while (h) {
            if (c < 16) h = true;
            else h = false;
            if (c == 0) h = false;
            c = (c - 1);
            System.out.println("Hello World!");
        }

        fireAll(10);
    }
}
