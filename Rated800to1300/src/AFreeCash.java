import java.util.Scanner;

public class AFreeCash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxCash = 1;
        int currentCash = 1;
        int prevH = -1;
        int prevM = -1;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            if (i > 0) {
                if (h == prevH && m == prevM) {
                    currentCash++;
                } else {
                    currentCash = 1;
                }
            }
            if (currentCash > maxCash) {
                maxCash = currentCash;
            }
            prevH = h;
            prevM = m;
        }
        System.out.println(maxCash);
        sc.close();
    }
}