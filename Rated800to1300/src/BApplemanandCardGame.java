import java.util.*;

public class BApplemanandCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        String s = sc.next();
        long[] freq = new long[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'A']++;
        }
        Arrays.sort(freq);
        long totalCoins = 0;
        for (int i = 25; i >= 0 && k > 0; i--) {
            if (freq[i] <= k) {
                totalCoins += freq[i] * freq[i];
                k -= freq[i];
            } else {
                totalCoins += k * k;
                k = 0;
            }
        }
        System.out.println(totalCoins);
    }
}