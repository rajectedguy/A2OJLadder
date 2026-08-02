import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APanoramixsPrediction {
    public static boolean IsPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int NextPrime(int n) {
        int num = n + 1;

        while (true) {
            if (IsPrime(num)) {
                return num;
            }
            num++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        if (m == NextPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
