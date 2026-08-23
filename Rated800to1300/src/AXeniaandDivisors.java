import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AXeniaandDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cnt = new int[8];
        for (int i = 0; i < n; i++) {
            cnt[sc.nextInt()]++;
        }
        List<String> result = new ArrayList<>();
        while (cnt[1] > 0 && cnt[2] > 0 && cnt[4] > 0) {
            cnt[1]--;
            cnt[2]--;
            cnt[4]--;
            result.add("1 2 4");
        }
        while (cnt[1] > 0 && cnt[2] > 0 && cnt[6] > 0) {
            cnt[1]--;
            cnt[2]--;
            cnt[6]--;
            result.add("1 2 6");
        }
        while (cnt[1] > 0 && cnt[3] > 0 && cnt[6] > 0) {
            cnt[1]--;
            cnt[3]--;
            cnt[6]--;
            result.add("1 3 6");
        }
        for (int i = 1; i <= 7; i++) {
            if (cnt[i] != 0) {
                System.out.println("-1");
                return;
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
