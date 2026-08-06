import java.util.*;

public class AHelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> n = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                n.add(c - '0');
            }
        }
        Collections.sort(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n.size(); i++) {
            result.append(n.get(i));
            if (i != n.size()-1){
                result.append('+');
            }
        }
        System.out.print(result);
        sc.close();
    }
}