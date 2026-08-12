import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class APetrandBook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] days = new int[7];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 7; i++) {
            days[i] = Integer.parseInt(st.nextToken());
        }
        int day = 0;

        while (N > 0) {
            N -= days[day];
            if (N <= 0) {
                System.out.println(day + 1);
                break;
            }
            day = (day + 1) % 7;
        }
    }
}