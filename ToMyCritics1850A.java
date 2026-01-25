import java.util.Scanner;

public class ToMyCritics1850A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a + b >= 10 || b + c >= 10 || a + c >= 10)
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
