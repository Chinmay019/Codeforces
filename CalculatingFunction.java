package src;

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n % 2 == 0) {
            System.out.println(n/2);
        } else {
            System.out.println((long) Math.floor(-n/2.0));
        }
    }
}
