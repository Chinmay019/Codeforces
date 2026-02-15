import java.util.Scanner;

public class SendingMessages1921C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long f = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long cost = 0;
            int[] m = new int[n + 1];
            m[0] = 0;
            for(int i = 1; i <= n; i++) {
                m[i] =sc.nextInt();
            }
            for(int i = 1; i <= n; i++) {
                int diff = m[i] - m[i - 1];
                cost += Math.min(b, diff * a);
            }
            if(cost < f) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
