import java.util.Scanner;

public class ALightsOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];
        int[][] res = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = grid[i][j];
                if (i - 1 >= 0) {
                    sum += grid[i - 1][j];
                }
                if (i + 1 < 3) {
                    sum += grid[i + 1][j];
                }
                if (j - 1 >= 0) {
                    sum += grid[i][j - 1];
                }
                if (j + 1 < 3) {
                    sum += grid[i][j + 1];
                }

                if (sum % 2 == 0) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
