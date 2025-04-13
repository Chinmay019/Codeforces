import java.util.Scanner;

public class Marathon1692A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0 ) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int count = 0;
            if(b > a) count++;
            if(c > a) count++;
            if(d > a) count++;
            System.out.println(count);
        }
    }
}
