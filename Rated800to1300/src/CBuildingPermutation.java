import java.util.Arrays;
import java.util.Scanner;

public class CBuildingPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long totalMoves = 0;
        for (int i = 0; i < n; i++) {
            totalMoves += Math.abs(a[i] - (i + 1));
        }
        System.out.println(totalMoves);
        sc.close();
    }
}