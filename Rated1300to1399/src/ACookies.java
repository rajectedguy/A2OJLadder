import java.util.Scanner;

public class ACookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            totalSum += a[i];
        }
        int ways = 0;
        for (int i = 0; i < n; i++) {
            if ((totalSum - a[i]) % 2 == 0) {
                ways++;
            }
        }
        System.out.println(ways);
    }
}