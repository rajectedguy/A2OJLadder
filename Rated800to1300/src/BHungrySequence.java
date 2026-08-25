import java.util.Scanner;

public class BHungrySequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = n + 1; i <= 2 * n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}