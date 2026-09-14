import java.util.Scanner;

public class ASerejaandBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int unopenedCount = 0;
        for (int i = 0; i < n; i++) {
            boolean canBeOpened = false;
            for (int j = 0; j < n; j++) {
                if (i != j && b[j] == a[i]) {
                    canBeOpened = true;
                    break;
                }
            }
            if (!canBeOpened) {
                unopenedCount++;
            }
        }
        System.out.println(unopenedCount);
        sc.close();
    }
}