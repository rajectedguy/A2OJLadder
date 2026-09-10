import java.util.Scanner;

public class AFlippingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int initialOnes = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) initialOnes++;
        }
        int maxGain = -1;
        int currentGain = 0;
        for (int i = 0; i < n; i++) {
            int value = (a[i] == 0) ? 1 : -1;
            currentGain += value;
            if (currentGain > maxGain) {
                maxGain = currentGain;
            }
            if (currentGain < 0) {
                currentGain = 0;
            }
        }
        System.out.println(initialOnes + maxGain);
    }
}