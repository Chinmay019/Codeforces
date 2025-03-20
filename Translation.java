package src;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        StringBuilder sb = new StringBuilder(t);
        String rev = sb.reverse().toString();

        if(s.equals(rev))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
