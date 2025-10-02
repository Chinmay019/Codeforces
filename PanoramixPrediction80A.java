import java.util.Scanner;

public class PanoramixPrediction80A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(!isPrime(n)) {
            System.out.println("NO");
            return;
        }
        for(int i = m + 1; i < n; i++) {
            if(isPrime(i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    static boolean isPrime(int a) {
        for(int i = 2; i <= (a / 2); i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
