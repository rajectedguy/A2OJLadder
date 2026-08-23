import java.util.Scanner;

public class AShooshunsandSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = n - 1;
        while (pos > 0 && a[pos] == a[pos - 1]) {
            pos--;
        }
        if (pos > k - 1) {
            System.out.println(-1);
        } else {
            System.out.println(pos);
        }
    }
}