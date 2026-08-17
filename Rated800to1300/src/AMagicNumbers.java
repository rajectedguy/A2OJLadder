import java.util.Scanner;

public class AMagicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        boolean magic = true;
        while (i < s.length()) {
            if (i + 3 <= s.length() && s.startsWith("144", i)) {
                i += 3;
            }
            else if (i + 2 <= s.length() && s.startsWith("14", i)) {
                i += 2;
            }
            else if (s.charAt(i) == '1') {
                i += 1;
            }
            else {
                magic = false;
                break;
            }
        }
        if (magic) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}