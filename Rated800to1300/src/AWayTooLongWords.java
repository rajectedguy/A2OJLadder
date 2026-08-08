import java.util.Scanner;

class AwayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            String word = sc.nextLine();
            if (word.length() > 10){
                int midleword = word.length()-2;
                String changeword = word.charAt(0) + String.valueOf(midleword) + word.charAt(word.length()-1);
                System.out.println(changeword);
            } else {
                System.out.println(word);
            }
        }
        sc.close();
    }
}