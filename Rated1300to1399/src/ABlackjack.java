import java.util.Scanner;

public class ABlackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int needed = n - 10;

        if (needed <= 0 || needed > 11) {
            System.out.println(0);
        } else if (needed == 10) {
            System.out.println(15);
        } else if (needed == 11) {
            System.out.println(4);
        } else {
            System.out.println(4);
        }
    }
}