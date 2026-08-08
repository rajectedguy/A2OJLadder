import java.util.*;

public class AAmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();
        String combined = guest + host;
        char[] combinedChars = combined.toCharArray();
        char[] pileChars = pile.toCharArray();
        Arrays.sort(combinedChars);
        Arrays.sort(pileChars);
        if (Arrays.equals(combinedChars, pileChars)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}