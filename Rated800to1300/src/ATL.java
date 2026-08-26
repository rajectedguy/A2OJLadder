
import java.util.Scanner;

public class ATL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int minCorrect = 101;
        int maxCorrect = 0;
        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            if (time < minCorrect) minCorrect = time;
            if (time > maxCorrect) maxCorrect = time;
        }
        int minWrong = 101;
        for (int i = 0; i < m; i++) {
            int time = sc.nextInt();
            if (time < minWrong) minWrong = time;
        }
        int v = Math.max(maxCorrect, 2 * minCorrect);
        if (v < minWrong) {
            System.out.println(v);
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}