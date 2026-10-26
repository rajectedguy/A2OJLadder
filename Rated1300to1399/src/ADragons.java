import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ADragons {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] dragons = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            dragons[i][0] = Integer.parseInt(st.nextToken());
            dragons[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(dragons, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < n; i++) {
            if (s > dragons[i][0]) {
                s += dragons[i][1];
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}