import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InsomniaCure148A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for(int i = k; i <= d; i += k) {
            set.add(i);
        }
        for(int i = l; i <= d; i += l) {
            set.add(i);
        }
        for(int i = m; i <= d; i += m) {
            set.add(i);
        }
        for(int i = n; i <= d; i += n) {
            set.add(i);
        }
        System.out.println(set.size());
    }
}
