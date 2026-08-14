import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AHexadecimalstheorem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());

        // Small cases
        if (n == 0) {
            System.out.println("0 0 0");
            return;
        }
        if (n == 1) {
            System.out.println("1 0 0");
            return;
        }
        if (n == 2) {
            System.out.println("1 1 0");
            return;
        }
        if (n == 3) {
            System.out.println("1 1 1");
            return;
        }
        ArrayList<Long> fib = new ArrayList<>();
        fib.add(0L);
        fib.add(1L);
        while (fib.getLast() < n) {
            int sz = fib.size();
            fib.add(fib.get(sz - 1) + fib.get(sz - 2));
        }
        int k = fib.size() - 1;
        long a = fib.get(k - 1);
        long b = fib.get(k - 3);
        long c = fib.get(k - 4);

        System.out.println(a + " " + b + " " + c);
    }
}