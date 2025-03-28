import java.util.Scanner;

public class CandiesAndTwoSisters1335A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            // if n is even ans = n / 2 - 1
            // if n is odd ans = n / 2
            if(n % 2 == 1) {
                System.out.println((int) n / 2);
            } else {
                System.out.println(((int) n/ 2) - 1);
            }
        }
    }
}
