import java.util.Scanner;

public class ATram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int c = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c-=a[i];
            c+=b[i];
            d =Math.max(c,d);
        }
        System.out.println(d);
        sc.close();
    }
}