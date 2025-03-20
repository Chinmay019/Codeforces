package src;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        long ans = (long) (Math.ceil((double)n / a) * Math.ceil((double)m / a));
        System.out.println(ans);
    }
}
