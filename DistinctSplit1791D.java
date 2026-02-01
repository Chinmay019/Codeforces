import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctSplit1791D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] prefix = new int[n];
            int[] suffix = new int[n];
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < n; i++) {
                seen.add(s.charAt(i));
                prefix[i] = seen.size();
            }
            seen.clear();
            for(int i = n - 1; i >= 0; i--) {
                seen.add(s.charAt(i));
                suffix[i] = seen.size();
            }
            int max = 0;
            for(int i = 1; i < n; i++) {
                max = Math.max(max, prefix[i - 1] + suffix[i]);
            }
            System.out.println(max);
        }
    }
}
