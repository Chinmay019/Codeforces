package src;

import java.util.Scanner;

public class AntonAndPolyHedrons785A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = 0;
        while(t-- > 0) {
            String s = sc.next();
            if(s.startsWith("T"))
                ans += 4;
            if(s.startsWith("I"))
                ans += 20;
            if(s.startsWith("D"))
                ans += 12;
            if(s.startsWith("O"))
                ans += 8;
            if(s.startsWith("C"))
                ans += 6;
        }
        System.out.println(ans);
    }
}
