import java.util.Scanner;

public class AChips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int currentWalrus = 1;
        while (m >= currentWalrus) {
            m -= currentWalrus;
            currentWalrus++;
            if (currentWalrus > n) {
                currentWalrus = 1;
            }
        }
        System.out.println(m);
        sc.close();
    }
}