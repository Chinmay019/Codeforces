import java.util.Scanner;

public class HardProblem2044C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int m = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int ab = Math.min(m, a) + Math.min(m, b);
            int total = ab + Math.min(2 * m - ab, c);
            System.out.println(total);
        }
    }
}
