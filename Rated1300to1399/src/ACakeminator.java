import java.util.Scanner;

public class ACakeminator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        boolean[] rowHasStrawberry = new boolean[r];
        boolean[] colHasStrawberry = new boolean[c];
        for (int i = 0; i < r; i++) {
            String line = sc.next();
            for (int j = 0; j < c; j++) {
                if (line.charAt(j) == 'S') {
                    rowHasStrawberry[i] = true;
                    colHasStrawberry[j] = true;
                }
            }
        }
        int edibleRows = 0;
        for (int i = 0; i < r; i++) {
            if (!rowHasStrawberry[i]) edibleRows++;
        }
        int edibleCols = 0;
        for (int j = 0; j < c; j++) {
            if (!colHasStrawberry[j]) edibleCols++;
        }
        int totalEaten = (edibleRows * c) + (edibleCols * r) - (edibleRows * edibleCols);
        System.out.println(totalEaten);
    }
}