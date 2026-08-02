import java.util.Scanner;

public class BDrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        double ans = 0;
        double temp = 0;
        for (int i = 0; i < n; i++) {
            temp +=p[i] ;
        }
        ans = temp / n;
        System.out.println(ans);
        sc.close();
    }
}
