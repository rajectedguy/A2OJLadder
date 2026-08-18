import java.util.Arrays;
import java.util.Scanner;

public class ABusinesstrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[12];
        for (int i = 0; i < 12; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        int count = 0;
        for (int i = 11; i >= 0; i--) {
            if (sum < k) {
                sum += a[i];
                count++;
            }
        }
        if (sum < k) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}