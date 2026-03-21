import java.util.Scanner;

public class OrdinaryNumbers1520B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int ans = 0;
            int n = sc.nextInt();
            for (long  pow = 1; pow <= n; pow = pow * 10 + 1) {
                for(int d = 1; d <= 9; d++) {
                    if(pow * d <= n) ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
