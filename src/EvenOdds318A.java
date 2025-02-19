package src;

import java.util.Scanner;

public class EvenOdds318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long count;
        long oddCount = (long) Math.ceil(n/2.0);
        if(k > oddCount) {
            count = 2 * (k - oddCount);
        } else {
            count = 2 * (k - 1) + 1;
        }
        System.out.println(count);
    }
}
