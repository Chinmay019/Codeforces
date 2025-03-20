package src;

import java.util.Scanner;

public class FloorOrCeil2082B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int val = sc.nextInt(); // no
            long n = sc.nextInt(); // no of floor
            long m = sc.nextInt(); // no of ceil

            // maximum case
            int val1 = val;
            long n1 = n, m1 = m;
            while(val1 > 0 && n1 > 0 && m1 > 0) {
                if(val1 % 2 == 0) {
                    val1 = (int) Math.floor(val1/2.0);
                    n1--;
                } else {
                    val1 = (int) Math.ceil(val1/ 2.0);
                    m1--;
                }
                System.out.println("val1 is: " + val1);
            }
            while(val1 > 0 && n1 > 0) {
                val1 = (int) Math.floor(val1/2.0);
                n1--;
            }
            while(val1 > 0 && m1 > 0) {
                val1 = (int) Math.floor(val1/2.0);
                m1--;
            }

            // minimum case
            int val2 = val;
            long n2 = n, m2 = m;
            while(val2 > 0 && n2 > 0 && m2 > 0) {
                if(val2 == 0)
                    break;
                if(val2 % 2 == 1) {
                    val2 = (int) Math.floor(val2/2.0);
                    n2--;
                } else {
                    val2 = (int) Math.ceil(val2/ 2.0);
                    m2--;
                }
                System.out.println("val2 is: " + val2);
            }
            while(val2 > 0 && n2 > 0) {
                val1 = (int) Math.floor(val1/2.0);
                n2--;
            }
            while(val2 > 0 && m2 > 0) {
                val1 = (int) Math.floor(val1/2.0);
                m2--;
            }
            System.out.println(val1 + " " + val2);
        }
    }
}
