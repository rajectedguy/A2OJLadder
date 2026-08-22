import java.util.Scanner;

public class BShowerLine {
    static int[][] g = new int[5][5];
    static boolean[] used = new boolean[5];
    static int[] p = new int[5];
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                g[i][j] = sc.nextInt();
            }
        }
        permute(0);

        System.out.println(ans);
    }
    static void permute(int idx) {
        if (idx == 5) {
            calculateHappiness();
            return;
        }
        for (int i = 0; i < 5; i++) {
            if (!used[i]) {
                used[i] = true;
                p[idx] = i;
                permute(idx + 1);
                used[i] = false;
            }
        }
    }
    static void calculateHappiness() {
        int sum = 0;
        sum += g[p[0]][p[1]] + g[p[1]][p[0]];
        sum += g[p[2]][p[3]] + g[p[3]][p[2]];
        sum += g[p[1]][p[2]] + g[p[2]][p[1]];
        sum += g[p[3]][p[4]] + g[p[4]][p[3]];
        sum += g[p[2]][p[3]] + g[p[3]][p[2]];
        sum += g[p[3]][p[4]] + g[p[4]][p[3]];
        ans = Math.max(ans, sum);
    }
}