import java.util.Scanner;

public class AAddingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        for (int d = 0; d <= 9; d++) {
            long temp = (long) a * 10 + d;
            if (temp % b == 0) {
                sb.append(temp);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < n - 1; i++) {
                sb.append("0");
            }
            System.out.println(sb.toString());
        }
    }
}