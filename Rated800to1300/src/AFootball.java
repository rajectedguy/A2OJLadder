import java.util.Scanner;
import java.util.HashMap;

public class AFootball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> goals = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String team = sc.nextLine();
            goals.put(team, goals.getOrDefault(team, 0) + 1);
        }
        String winner = "";
        int maxGoals = 0;
        for (String team : goals.keySet()) {
            if (goals.get(team) > maxGoals) {
                maxGoals = goals.get(team);
                winner = team;
            }
        }
        System.out.println(winner);
        sc.close();
    }
}