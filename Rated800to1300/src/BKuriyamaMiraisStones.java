import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BKuriyamaMiraisStones {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        long[] v = new long[n + 1];
        long[] u = new long[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            v[i] = Long.parseLong(st.nextToken());
            u[i] = v[i];
        }
        Arrays.sort(u, 1, n + 1);
        long[] prefV = new long[n + 1];
        long[] prefU = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefV[i] = prefV[i - 1] + v[i];
            prefU[i] = prefU[i - 1] + u[i];
        }
        int m = Integer.parseInt(br.readLine());
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            if (type == 1) {
                out.println(prefV[r] - prefV[l - 1]);
            } else {
                out.println(prefU[r] - prefU[l - 1]);
            }
        }
        out.flush();
        out.close();
    }
}