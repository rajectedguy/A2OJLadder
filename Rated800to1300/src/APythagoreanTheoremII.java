import java.util.Scanner;

public class APythagoreanTheoremII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        boolean[] isSquare = new boolean[n * n + 1];
        for (int i = 1; i <= n; i++) {
            isSquare[i * i] = true;
        }
        int count = 0;
        for (int a = 1; a <= n; a++) {
            int a2 = a * a;
            for (int b = a; b <= n; b++) {
                int sumSq = a2 + b * b;
                if (sumSq > n * n) {
                    break;
                }
                if (isSquare[sumSq]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}