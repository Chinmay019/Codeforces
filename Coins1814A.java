import java.util.Scanner;

public class Coins1814A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            // n is odd and k is even -> not possible
            if(n % 2 == 1 && k % 2 == 0) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
