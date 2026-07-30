import java.util.Scanner;

public class ABeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print(moves(matrix));
        sc.close();
    }
    private static int moves(int[][] matrix) {
        int row = -1;
        int col = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(matrix[i][j] == 1) {
                    row = i;
                    col = j;
                    break;
                }
            }
            if (row != -1){
                break;
            }
        }
        return Math.abs(row - 2) + Math.abs(col - 2);
    }
}