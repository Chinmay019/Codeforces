import java.util.Scanner;

public class YetAnotherTwoIntegerProblem1409A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == b){
                System.out.println(0);
                continue;
            }

            if ( a > b ) {
                int temp = a;
                a = b;
                b = temp;
            }

            int diff = b - a;
            int div = diff / 10;
            int mod = diff % 10;
            int ans = div;

            if(mod > 0) {
                ans++;
            }
            System.out.println(ans);
        }
    }
}
