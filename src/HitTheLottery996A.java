package src;

import java.util.Scanner;

public class HitTheLottery996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n - 100 >= 0) {
            n -= 100;
            ans += 1;
        }
        while(n - 20 >= 0) {
            n -= 20;
            ans += 1;
        }
        while(n - 10 >= 0) {
            n -= 10;
            ans += 1;
        }
        while(n - 5 >= 0) {
            n -= 5;
            ans += 1;
        }
        while(n - 1 >= 0) {
            n -= 1;
            ans += 1;
        }
        System.out.println(ans);
    }
}
