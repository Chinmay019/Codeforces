import java.util.Scanner;

public class ConsecutiveSumRiddle1594A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            System.out.println((1 - n) + " " + n);
        }
    }
}
