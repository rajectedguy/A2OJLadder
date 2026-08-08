import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ABoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> distinctCharacters = new HashSet<>();
        for (char c : s.toCharArray()) {
            distinctCharacters.add(c);
        }
        if(distinctCharacters.size() % 2 == 1){
            System.out.print("IGNORE HIM!");
        }else {
            System.out.print("CHAT WITH HER!");
        }
        sc.close();
    }
}