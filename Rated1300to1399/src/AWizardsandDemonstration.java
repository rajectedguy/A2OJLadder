import java.util.Scanner;

public class AWizardsandDemonstration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int requiredParticipants = (n * y + 99) / 100;

        int clonesNeeded = Math.max(0, requiredParticipants - x);

        System.out.println(clonesNeeded);

        sc.close();
    }
}
