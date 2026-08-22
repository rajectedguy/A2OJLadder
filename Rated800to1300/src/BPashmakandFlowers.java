import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BPashmakandFlowers {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = fs.nextLong();
            min = Math.min(min, b[i]);
            max = Math.max(max, b[i]);
        }
        long diff = max - min;
        if (diff == 0) {
            long ways = (long) n * (n - 1) / 2;
            System.out.println(diff + " " + ways);
            return;
        }
        long cntMin = 0, cntMax = 0;
        for (long x : b) {
            if (x == min) cntMin++;
            if (x == max) cntMax++;
        }
        long ways = cntMin * cntMax;
        System.out.println(diff + " " + ways);
    }
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}