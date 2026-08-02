import java.util.Scanner;

public class AArrivaloftheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = 0, maxIndex = 0;
        int min = 101, minIndex = n-1;

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] <= min) {
                min = a[i];
                minIndex = i;
            }
        }

        int swaps = 0;
        if (maxIndex > minIndex) {
            swaps = maxIndex + n - 1 - 1 - minIndex;
        } else {
            swaps = maxIndex + n - 1 - minIndex;
        }

        System.out.println(swaps);
        sc.close();
    }
}
