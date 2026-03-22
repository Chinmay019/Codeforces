import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DontBeDistracted1520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean suspicious = false;
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if(set.contains(c)) {
                    suspicious = true;
                    break;
                }
                set.add(c);
                while(i < n && s.charAt(i) == c) i++;
                i -= 1;
            }
            if(suspicious) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
