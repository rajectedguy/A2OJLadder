import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BAirport {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : a) maxPQ.add(x);
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int seats = maxPQ.poll();
            maxSum += seats;
            if (seats - 1 > 0) {
                maxPQ.add(seats - 1);
            }
        }
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        for (int x : a) minPQ.add(x);
        int minSum = 0;
        for (int i = 0; i < n; i++) {
            int seats = minPQ.poll();
            minSum += seats;
            if (seats - 1 > 0) {
                minPQ.add(seats - 1);
            }
        }
        System.out.println(maxSum + " " + minSum);
    }
}