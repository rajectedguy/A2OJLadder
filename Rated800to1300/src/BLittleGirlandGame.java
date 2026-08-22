import java.util.Scanner;

public class BLittleGirlandGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int oddCount = 0;
        for (int f : freq) {
            if ((f & 1) == 1) {
                oddCount++;
            }
        }

        if (oddCount == 0 || (oddCount & 1) == 1) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}