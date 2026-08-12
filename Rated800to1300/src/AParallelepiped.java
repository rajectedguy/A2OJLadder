import java.util.Scanner;

public class AParallelepiped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;
        int a1 = (int) Math.sqrt((double) (a * c) /b);
        int a2 = (int) Math.sqrt((double) (a * b) /c);
        int a3 = (int) Math.sqrt((double) (b * c) /a);
        sum = 4 * (a1 + a2 + a3);
        System.out.println(sum);
    }
}