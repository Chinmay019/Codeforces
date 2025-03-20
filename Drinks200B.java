package src;

import java.util.Scanner;

public class Drinks200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        long tot = 0;
        while(n-- > 0) {
            tot += sc.nextInt();
        }
        System.out.println(tot * 1.0/temp);
    }
}
