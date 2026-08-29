import java.util.Scanner;

public class ADomino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumUpper = 0;
        int sumLower = 0;
        boolean hasMixedParity = false;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sumUpper += x;
            sumLower += y;
            if ((x % 2) != (y % 2)) {
                hasMixedParity = true;
            }
        }
        if (sumUpper % 2 == 0 && sumLower % 2 == 0) {
            System.out.println(0);
        } else if (sumUpper % 2 != sumLower % 2) {
            System.out.println(-1);
        } else {
            if (hasMixedParity) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}