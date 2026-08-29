import java.util.Scanner;

public class BEasyNumberChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxN = a * b * c;
        int MOD = 1073741824;

        int[] d = new int[maxN + 1];
        for (int i = 1; i <= maxN; i++) {
            for (int j = i; j <= maxN; j += i) {
                d[j]++;
            }
        }

        long totalSum = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    totalSum = (totalSum + d[i * j * k]) % MOD;
                }
            }
        }

        System.out.println(totalSum);
    }
}