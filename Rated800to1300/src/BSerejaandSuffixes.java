import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BSerejaandSuffixes {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int[] distinctCount = new int[n + 1];
        boolean[] seen = new boolean[100001];
        int currentDistinct = 0;
        for (int i = n; i >= 1; i--) {
            if (!seen[a[i]]) {
                seen[a[i]] = true;
                currentDistinct++;
            }
            distinctCount[i] = currentDistinct;
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            out.println(distinctCount[l]);
        }
        out.flush();
        out.close();
    }
}