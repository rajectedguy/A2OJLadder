import java.util.Scanner;

public class AVasilytheBearandTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long s = Math.abs(x) + Math.abs(y);
        long x1, y1, x2, y2;
        if (x > 0 && y > 0) {
            x1 = 0; y1 = s; x2 = s; y2 = 0;
        } else if (x < 0 && y > 0) {
            x1 = -s; y1 = 0; x2 = 0; y2 = s;
        } else if (x < 0 && y < 0) {
            x1 = -s; y1 = 0; x2 = 0; y2 = -s;
        } else {
            x1 = 0; y1 = -s; x2 = s; y2 = 0;
        }
        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
    }
}