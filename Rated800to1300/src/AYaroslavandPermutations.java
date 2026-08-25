import java.util.Scanner;

public class AYaroslavandPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] freq = new int[1001];
        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            freq[a[i]]++;
            if (freq[a[i]] > maxFreq) {
                maxFreq = freq[a[i]];
            }
        }
        if (maxFreq <= (n + 1) / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}