import java.util.Scanner;

public class MagicalSticks1371A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            System.out.println(n % 2 == 0 ? n / 2 : n / 2 + 1);
        }
    }
}
