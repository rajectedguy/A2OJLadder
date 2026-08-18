import java.util.Scanner;

public class ADubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean space = false;
        while (i < s.length()){
            if (i+2 < s.length() && s.charAt(i) == 'W' && s.charAt(i+1)== 'U' && s.charAt(i+2) == 'B'){
                i+=3;
                if (space){
                    sb.append(' ');
                    space = false;
                }
            }else {
                sb.append(s.charAt(i));
                i++;
                space = true;
            }
        }
        System.out.println(sb.toString().trim());
        //String original = s.replaceAll("(WUB)+", " ").trim();
        sc.close();
    }
}