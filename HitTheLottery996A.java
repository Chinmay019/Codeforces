package src;

import java.util.Scanner;

public class HitTheLottery996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        ans += n / 100;
        n = n % 100;

        ans += n / 20;
        n = n % 20;

        ans += n / 10;
        n = n % 10;

        ans += n / 5;
        n = n % 5;

        ans += n;

        System.out.println(ans);
    }
}
