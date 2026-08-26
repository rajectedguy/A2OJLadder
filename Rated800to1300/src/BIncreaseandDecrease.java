
import java.util.Scanner;

public class BIncreaseandDecrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        if (sum % n == 0) {
            System.out.println(n);
        } else {
            System.out.println(n - 1);
        }
        sc.close();
    }
}