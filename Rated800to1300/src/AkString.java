import java.util.Scanner;

public class AkString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] % k != 0) {
                System.out.println("-1");
                return;
            }
        }
        StringBuilder base = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int times = freq[i] / k;
            base.append(String.valueOf((char) (i + 'a')).repeat(Math.max(0, times)));
        }
        System.out.println(String.valueOf(base).repeat(Math.max(0, k)));
    }
}