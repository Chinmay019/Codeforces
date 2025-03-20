package src;

import java.util.Scanner;

public class ToZero2017A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long count = 0;
            while(n > 0) {
                if(n < k) {
                    count++;
                    break;
                }
                if(n % 2 == 1) {
                    n -= k;
                    count++;
                } else{
                    int tot = (int) Math.floor(n / (k - 1.0));
                    count += tot;
                    n = n % (k - 1);
                }
            }
            System.out.println(count);
        }
    }
}
