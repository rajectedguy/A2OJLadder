import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ALittleElephantandRozdil {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[] time = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            time[i] = Long.parseLong(st.nextToken());
        }
        long mini = Long.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (time[i] < mini) {
                mini = time[i];
                idx = i;
            }
        }
        int count = 0;
        for (int i = idx + 1; i < n; i++) {
            if (time[i] == mini) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(idx+1);
        }else {
            System.out.println("Still Rozdil");
        }
    }
}