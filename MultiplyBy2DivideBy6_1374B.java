import java.util.Scanner;

public class MultiplyBy2DivideBy6_1374B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            while(n > 0) {
                if(n == 1) {
                    System.out.println(count);
                    break;
                }
                if(n % 6 == 0) {
                    n /= 6;
                    count++;
                } else if(n % 6 == 3) {
                    n *= 2;
                    count++;
                } else {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
