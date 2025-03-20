package src;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count = 0;
        while(num > 0) {
            if(num % 10 == 4 || num % 10 == 7)
                count++;
            num /= 10;
        }
        if(count == 4 || count == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
