import java.util.Scanner;

public class BFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();
        long currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += h[i];
        }
        long minSum = currentSum;
        int minIndex = 1;
        for (int i = 1; i <= n - k; i++) {
            currentSum -= h[i - 1];
            currentSum += h[i + k - 1];
            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i + 1;
            }
        }
        System.out.println(minIndex);
    }
}