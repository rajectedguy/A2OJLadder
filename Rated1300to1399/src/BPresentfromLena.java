import java.util.Scanner;

public class BPresentfromLena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int s = 0; s < 2 * (n - i); s++) {
                System.out.print(" ");
            }
            for (int num = 0; num <= i; num++) {
                System.out.print(num);
                if (num != i) System.out.print(" ");
            }
            for (int num = i - 1; num >= 0; num--) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int s = 0; s < 2 * (n - i); s++) {
                System.out.print(" ");
            }
            for (int num = 0; num <= i; num++) {
                System.out.print(num);
                if (num != i) System.out.print(" ");
            }
            for (int num = i - 1; num >= 0; num--) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }
}