package src;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = 0;

        for(int i = 0; i < n; i++ ) {
            int a = sc.nextInt();
            if(a <= h)
                w++;
            else
                w += 2;

        }
        System.out.println(w);
    }
}
