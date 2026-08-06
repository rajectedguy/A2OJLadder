import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACupboards {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int l1 = 0;
        int l2 = 0;
        int r1 =0;
        int r2 =0;
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            if (l == 0){
                l1++;
            }else {
                l2++;
            }
            if (r == 0){
                r1++;
            }else {
                r2++;
            }

        }
        int ans= Math.min(l1,l2)+Math.min(r1,r2);
        System.out.println(ans);
    }
}
