import java.util.Scanner;

public class AHQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'H' || s.charAt(i) == 'Q'
                    || s.charAt(i) == '9'){
                b=true;
                break;
            }
        }
        if (b){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        sc.close();
    }
}
