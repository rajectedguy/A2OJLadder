import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class APuzzles {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] f = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            f[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(f);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + n - 1 < m; i++) {
            int diff = f[i + n - 1] - f[i];
            ans = Math.min(ans, diff);
        }
        System.out.println(ans);
    }
}