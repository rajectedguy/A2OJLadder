
import java.util.Arrays;
import java.util.Scanner;

public class BUnluckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ticket = sc.next();
        int[] firstHalf = new int[n];
        int[] secondHalf = new int[n];
        for (int i = 0; i < n; i++) {
            firstHalf[i] = ticket.charAt(i) - '0';
            secondHalf[i] = ticket.charAt(i + n) - '0';
        }
        Arrays.sort(firstHalf);
        Arrays.sort(secondHalf);
        boolean allLess = true;
        boolean allGreater = true;
        for (int i = 0; i < n; i++) {
            if (firstHalf[i] >= secondHalf[i]) {
                allLess = false;
            }
            if (firstHalf[i] <= secondHalf[i]) {
                allGreater = false;
            }
        }
        if (allLess || allGreater) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}