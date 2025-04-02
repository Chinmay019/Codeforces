import java.util.Scanner;

public class OddDivisor1475A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n % 2 == 1)
                System.out.println("Yes");
            else {
                while(n % 2 == 0) {
                    n /= 2;
                }
                if(n == 1)
                    System.out.println("NO");
                else
                    System.out.println("Yes");
            }
        }
    }
}
