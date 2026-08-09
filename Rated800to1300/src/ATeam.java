import java.util.Scanner;

public class ATeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int issure = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
            int sure = p + v + t;
            if (sure >= 2) {
                issure++;
            }
        }
        System.out.print(issure);
        sc.close();
    }
}
