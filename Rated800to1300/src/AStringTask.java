import java.util.Scanner;

public class AStringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'A' && ch != 'a' &&
                    ch != 'O' && ch != 'o' &&
                    ch != 'Y' && ch != 'y' &&
                    ch != 'E' && ch != 'e' &&
                    ch != 'U' && ch != 'u' &&
                    ch != 'I' && ch != 'i') {

                sb.append('.');
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
