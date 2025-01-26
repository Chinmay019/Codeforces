package src;

import java.util.Scanner;

public class SoldierBananas {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int total = (k * w * (w + 1)) / 2;
        if(total > n) {
            System.out.println(total - n);
        } else {
            System.out.println(0);
        }
    }
}
