import java.util.*;

public class BTprimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        int LIMIT = 1000000;
        boolean[] isPrime = new boolean[LIMIT + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= LIMIT; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i <= LIMIT; i++) {
            if (isPrime[i]) primes.add(i);
        }
        for (long x : arr) {
            long root = (long) Math.sqrt(x);
            if (root * root == x && primes.contains((int) root)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}