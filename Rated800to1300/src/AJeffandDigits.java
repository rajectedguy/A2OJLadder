import java.util.Scanner;

public class AJeffandDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count0 = 0, count5 = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) count0++;
            else count5++;
        }
        if (count0 == 0) {
            System.out.println(-1);
            return;
        }
        if (count5 < 9) {
            System.out.println(0);
            return;
        }
        int usableFives = (count5 / 9) * 9;
        String sb = "5".repeat(usableFives) +
                "0".repeat(Math.max(0, count0));
        System.out.println(sb);
    }
}