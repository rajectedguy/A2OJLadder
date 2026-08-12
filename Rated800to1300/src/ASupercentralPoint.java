import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ASupercentralPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        int count = getCount(n, x, y);
        System.out.println(count);
    }

    private static int getCount(int n, int[] x, int[] y) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean left = false;
            boolean right = false;
            boolean up = false;
            boolean down = false;
            for (int j = 0; j < n; j++) {
                if (i == j){
                    continue;
                }
                if (y[i] == y[j]) {
                    if (x[i] > x[j]) {
                        left = true;
                    }else if (x[i] < x[j]) {
                        right = true;
                    }
                }
                if (x[i] == x[j]) {
                    if (y[i] > y[j]) {
                        down = true;
                    }else if (y[i] < y[j]) {
                        up = true;
                    }
                }
            }
            if (left && right && up && down) {
                count++;
            }
        }
        return count;
    }
}