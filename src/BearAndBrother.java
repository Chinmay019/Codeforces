package src;

import java.util.Scanner;

public class BearAndBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        while(a <= b) {
            b *= 2;
            a *= 3;
            ans++;
        }
        System.out.println(ans);
    }
}
