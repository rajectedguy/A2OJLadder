import java.util.Arrays;
import java.util.Scanner;

public class BSorttheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] sortedA = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sortedA[i] = a[i];
        }
        Arrays.sort(sortedA);
        int l = -1, r = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] != sortedA[i]) {
                if (l == -1) l = i;
                r = i;
            }
        }
        if (l == -1) {
            System.out.println("yes");
            System.out.println("1 1");
        } else {
            reverse(a, l, r);
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != sortedA[i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("yes");
                System.out.println((l + 1) + " " + (r + 1));
            } else {
                System.out.println("no");
            }
        }
    }
    private static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}