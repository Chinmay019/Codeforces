import java.util.Scanner;

public class Legs1996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int cows = n / 4;
            int c = (n - 4 * cows) / 2;
            System.out.println(cows + c);
        }
    }
}
