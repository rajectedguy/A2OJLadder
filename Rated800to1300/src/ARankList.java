import java.util.*;

public class ARankList {
    static class Team implements Comparable<Team> {
        int p, t;
        Team(int p, int t) {
            this.p = p;
            this.t = t;
        }
        @Override
        public int compareTo(Team other) {
            if (this.p != other.p) {
                return other.p - this.p;
            }
            return this.t - other.t;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            teams.add(new Team(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(teams);
        Team target = teams.get(k - 1);
        int count = 0;
        for (Team team : teams) {
            if (team.p == target.p && team.t == target.t) {
                count++;
            }
        }
        System.out.println(count);
    }
}