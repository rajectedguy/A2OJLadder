import java.util.Scanner;

public class ASoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int possibleDrink = (k * l) / nl;
        int lime = c * d;
        int salt = p / np;
        int min1 = Math.min(possibleDrink,lime);
        int min2 = Math.min(min1,salt);
        //System.out.println(Math.min((k * l) / nl, Math.min(c * d, p / np)) / n);
        System.out.println(min2/n);
        sc.close();
    }
}