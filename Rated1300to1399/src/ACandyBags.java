import java.util.Scanner;

public class ACandyBags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int left = 1;
            int right = n * n;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    System.out.print(left + " " + right + " ");
                    left++;
                    right--;
                }
                System.out.println();
            }
        }
        sc.close();
    }
}