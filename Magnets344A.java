package src;

import java.util.Arrays;
import java.util.Scanner;

public class Magnets344A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grp = 1;
        n--;
        String pastMagnet = sc.next();
        char[] latest = pastMagnet.toCharArray();
        while(n-- > 0) {
            String currMagnet = sc.next();
            if(!Arrays.equals(latest, currMagnet.toCharArray())) {
                grp++;
                latest = currMagnet.toCharArray();
            }
        }
        System.out.println(grp);
    }
}
