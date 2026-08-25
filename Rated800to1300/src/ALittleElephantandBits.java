import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ALittleElephantandBits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = s.length();
        int removeIndex = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                removeIndex = i;
                break;
            }
        }
        StringBuilder result = new StringBuilder();
        if (removeIndex != -1) {
            result.append(s, 0, removeIndex);
            result.append(s.substring(removeIndex + 1));
        } else {
            result.append(s, 0, n - 1);
        }
        int idx = 0;
        while (idx < result.length() && result.charAt(idx) == '0') {
            idx++;
        }
        System.out.println(idx == result.length() ? "0" : result.substring(idx));
    }
}