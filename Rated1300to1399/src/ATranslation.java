import java.util.Scanner;

public class ATranslation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if (s.length() != t.length()){
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(t.length() - 1 - i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        sc.close();
    }
}