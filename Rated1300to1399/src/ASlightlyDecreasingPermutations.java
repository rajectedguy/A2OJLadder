import java.util.Scanner;
import java.util.StringJoiner;

public class ASlightlyDecreasingPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < k; i++) {
            sj.add(String.valueOf(n - i));
        }
        for (int i = 1; i <= n - k; i++) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj.toString());
        sc.close();
    }
}