import java.io.*;
import java.util.*;

public class BJeffandPeriods {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int val = fs.nextInt();
            map.computeIfAbsent(val, k -> new ArrayList<>()).add(i);
        }

        List<int[]> result = new ArrayList<>();

        for (int x : new TreeSet<>(map.keySet())) {
            List<Integer> pos = map.get(x);

            if (pos.size() == 1) {
                result.add(new int[]{x, 0});
            } else {
                int diff = pos.get(1) - pos.get(0);
                boolean ok = true;

                for (int i = 2; i < pos.size(); i++) {
                    if (pos.get(i) - pos.get(i - 1) != diff) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    result.add(new int[]{x, diff});
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append('\n');
        for (int[] p : result) {
            sb.append(p[0]).append(' ').append(p[1]).append('\n');
        }

        System.out.print(sb.toString());
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int nextInt() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return Integer.parseInt(st.nextToken());
        }
    }
}