package src;

import java.util.Scanner;

public class YesOrYes1703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String val = sc.next();
            if(val.equalsIgnoreCase("yes")) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
