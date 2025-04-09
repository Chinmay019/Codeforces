import java.util.Scanner;

public class SoftDrinking151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt() , l = sc.nextInt(), c = sc.nextInt(),
                d = sc.nextInt(), p = sc.nextInt(), nl = sc.nextInt(), np = sc.nextInt();
        int x = (k * l) / nl;
        int y = (c  * d);
        int z = p / np;
        int ans = Math.min(x, Math.min(y, z)) / n;
        System.out.println(ans);
    }
}
