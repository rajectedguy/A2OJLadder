import java.util.Arrays;
import java.util.Scanner;

public class BSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n && count < m; i++) {
            if (p[i] < 0) {
                sum += -p[i];
                count++;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
