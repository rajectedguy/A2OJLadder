import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ADZYLovesChessboard {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            for (int j = 0; j < m; j++) {
                if (row.charAt(j) == '-') {
                    board[i][j] = '-';
                } else {
                    if ((i + j) % 2 == 0) {
                        board[i][j] = 'B';
                    } else {
                        board[i][j] = 'W';
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(new String(board[i]));
        }
    }
}