import java.util.Scanner;

public class ACinemaLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int count25 = 0;
        int count50 = 0;
        for (int i = 0; i < n; i++) {
            int bill = sc.nextInt();
            if (bill == 25) {
                count25++;
            } else if (bill == 50) {
                if (count25 > 0) {
                    count25--;
                    count50++;
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (bill == 100) {
                if (count50 > 0 && count25 > 0) {
                    count50--;
                    count25--;
                } else if (count25 >= 3) {
                    count25 -= 3;
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}