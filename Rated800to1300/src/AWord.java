import java.util.Scanner;

public class AWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int uc = 0;
        int lc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                uc++;
            } else if (ch >= 'a' && ch <= 'z') {
                lc++;
            }
        }
        if (uc > lc){
            System.out.println(s.toUpperCase());
        }else {
            System.out.println(s.toLowerCase());
        }
        sc.close();
    }
}
