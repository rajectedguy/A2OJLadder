
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ABoysandGirls {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            StringBuilder result = new StringBuilder();
            if (n >= m) {
                result.append("BG".repeat(Math.max(0, m)));
                result.append("B".repeat(Math.max(0, n - m)));
            }
            else {
                result.append("GB".repeat(Math.max(0, n)));
                result.append("G".repeat(Math.max(0, m - n)));
            }
            pw.println(result.toString());
        }
        pw.close();
        sc.close();
    }
}