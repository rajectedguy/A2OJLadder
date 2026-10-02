import java.util.Scanner;

public class ALunchRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long maxJoy = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long f = sc.nextLong();
            long t = sc.nextLong();
            long currentJoy;
            if (t > k) {
                currentJoy = f - (t - k);
            } else {
                currentJoy = f;
            }
            if (currentJoy > maxJoy) {
                maxJoy = currentJoy;
            }
        }
        System.out.println(maxJoy);
        sc.close();
    }
}