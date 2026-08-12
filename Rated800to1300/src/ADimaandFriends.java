import java.util.Scanner;

public class ADimaandFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        int people = n + 1;
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            if ((sum + i) % people != 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
