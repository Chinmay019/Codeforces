package src;

import java.util.Scanner;

public class Lucky1676A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String num = sc.next();
            int fsum = 0, lsum = 0;
            for(int i = 0; i < 3; i++ ) {
                fsum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            for(int i = 3; i < 6; i++ ) {
                lsum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            if(fsum == lsum){
                System.out.println("Yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
