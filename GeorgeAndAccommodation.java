package src;

import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        while(n-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(p + 2 <= q) ans++;
        }
        System.out.println(ans);
    }
}
