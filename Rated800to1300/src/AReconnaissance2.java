import java.util.Scanner;

public class AReconnaissance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mind = Math.abs(arr[0] - arr[n - 1]);
        int ans = n - 1;
        int ans1 = 0;
        for (int i = 1; i < n; i++) {
            int abs = Math.abs(arr[i] - arr[i - 1]);
            if (abs < mind) {
                mind = abs;
                ans = i - 1;
                ans1 = i;
            }
        }
        System.out.println((ans + 1) + " " + (ans1 + 1));
    }
}