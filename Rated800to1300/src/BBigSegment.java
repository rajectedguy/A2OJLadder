import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BBigSegment {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] l = new long[n];
        long[] r = new long[n];

        long minL = Long.MAX_VALUE;
        long maxR = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            l[i] = Long.parseLong(st.nextToken());
            r[i] = Long.parseLong(st.nextToken());

            minL = Math.min(minL, l[i]);
            maxR = Math.max(maxR, r[i]);
        }

        for (int i = 0; i < n; i++) {
            if (l[i] == minL && r[i] == maxR) {
                System.out.println(i + 1); // 1-based index
                return;
            }
        }

        System.out.println(-1);
    }
}