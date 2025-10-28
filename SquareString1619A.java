import java.util.Scanner;

public class SquareString1619A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            int n = s.length();
            if(n % 2 == 1) {
                System.out.println("No");
            } else {
                String s1 = s.substring(0, n / 2);
                String s2 = s.substring(n / 2);
                if(s1.equals(s2))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
