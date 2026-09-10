import java.util.Arrays;
import java.util.Scanner;

public class BPolothePenguinandMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n * m];
        for (int i = 0; i < n * m; i++) {
            a[i] = sc.nextInt();
        }
        int rem = a[0] % d;
        for (int i = 1; i < n * m; i++) {
            if (a[i] % d != rem) {
                System.out.println("-1");
                return;
            }
        }
        Arrays.sort(a);
        int median = a[n * m / 2];
        long moves = 0;
        for (int i = 0; i < n * m; i++) {
            moves += Math.abs(a[i] - median) / d;
        }
        System.out.println(moves);
    }
}