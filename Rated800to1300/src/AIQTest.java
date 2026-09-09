import java.util.Scanner;

public class AIQTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] grid = new char[4][4];
        for (int i = 0; i < 4; i++) {
            grid[i] = sc.next().toCharArray();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int blackCount = 0;
                if (grid[i][j] == '#') blackCount++;
                if (grid[i+1][j] == '#') blackCount++;
                if (grid[i][j+1] == '#') blackCount++;
                if (grid[i+1][j+1] == '#') blackCount++;
                if (blackCount != 2) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}