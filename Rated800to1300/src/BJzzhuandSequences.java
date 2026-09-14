import java.util.Scanner;

public class BJzzhuandSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long n = sc.nextLong();
        long mod = 1000000007;
        long[] results = new long[6];
        results[0] = x - y;
        results[1] = x;
        results[2] = y;
        results[3] = y - x;
        results[4] = -x;
        results[5] = -y;
        int index = (int) (n % 6);
        long ans = results[index];
        System.out.println((ans % mod + mod) % mod);
    }
}