import java.util.Scanner;

public class BBorze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length();) {
            if (s.charAt(i) == '.'){
                System.out.print("0");
                i++;
            }else if (s.charAt(i) == '-'){
                if (s.charAt(i+1) == '.'){
                    System.out.print("1");
                    i+=2;
                }else {
                    System.out.print("2");
                    i+=2;
                }
            }
        }
        sc.close();
    }
}
