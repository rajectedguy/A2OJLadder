import java.util.Scanner;

public class AUltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder s3 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)==s2.charAt(i)){
                s3.append(0);
            }else {
                s3.append(1);
            }
        }
        System.out.println(s3);
        sc.close();
    }
}
