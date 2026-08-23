import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s2.toCharArray()) {
            if (ch == ' ') continue;
            if (!freq.containsKey(ch) || freq.get(ch) == 0) {
                System.out.println("NO");
                return;
            }
            freq.put(ch, freq.get(ch) - 1);
        }
        System.out.println("YES");
    }
}