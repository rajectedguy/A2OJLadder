import java.util.Scanner;

public class AIloveusername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int amazing = 0;
        int maxScore = scores[0];
        int minScore = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > maxScore){
                amazing++;
                maxScore = scores[i];
            } else if (scores[i] < minScore){
                amazing++;
                minScore = scores[i];
            }
        }
        System.out.println(amazing);
        sc.close();
    }
}
