import java.util.Scanner;

public class ANearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int ln = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == '4' || ch == '7') {
                ln++;
            }
        }
        if (ln == 4 || ln ==7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        sc.close();
    }
}
