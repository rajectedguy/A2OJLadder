
import java.util.Scanner;

public class ATwoBagsofPotatoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long y = sc.nextLong();
        long k = sc.nextLong();
        long n = sc.nextLong();
        long startS = ((y / k) + 1) * k;
        if (startS > n) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for (long s = startS; s <= n; s += k) {
            sb.append(s - y).append(" ");
            found = true;
        }
        System.out.println(sb.toString().trim());
    }
}