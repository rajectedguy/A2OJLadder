import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AIsyourhorseshoeontheotherhoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        int uc = set.size();
        System.out.println(4-uc);
        sc.close();
    }
}