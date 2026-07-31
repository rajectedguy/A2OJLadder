import java.util.Scanner;

public class AWordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(sc.nextLine());
        String c = String.valueOf(sb.charAt(0)).toUpperCase();
        sb.replace(0,1, c);
        System.out.print(sb);
        sc.close();
    }
}
