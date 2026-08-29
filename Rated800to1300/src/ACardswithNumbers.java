import java.io.*;
import java.util.*;

public class ACardswithNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        List<Integer>[] groups = new ArrayList[5001];
        for (int i = 1; i <= 5000; i++) {
            groups[i] = new ArrayList<>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 2 * n; i++) {
            int val = Integer.parseInt(st.nextToken());
            groups[val].add(i);
        }
        for (int i = 1; i <= 5000; i++) {
            if (groups[i].size() % 2 != 0) {
                out.println("-1");
                out.close();
                br.close();
                return;
            }
        }
        for (int i = 1; i <= 5000; i++) {
            List<Integer> list = groups[i];
            for (int j = 0; j < list.size(); j += 2) {
                out.print(list.get(j));
                out.print(" ");
                out.println(list.get(j + 1));
            }
        }
        out.close();
        br.close();
    }
}