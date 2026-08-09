import java.util.Scanner;

public class APetyaandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();


        if (s1.length() != s2.length()) {
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println(-1);
                return;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
        sc.close();
    }
}
