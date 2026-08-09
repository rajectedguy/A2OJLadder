import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEffectiveApproach {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] pos = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int val = Integer.parseInt(st.nextToken());
            pos[val] = i;
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        long count1 = 0;
        long count2 = 0;
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());
            int p = pos[x];
            count1 += p;
            count2 += n - p + 1;
        }
        System.out.println(count1 + " " + count2);
    }
}