package src;

import java.util.Scanner;

public class ShapePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int ans = 0;

            int squarePerimeter = 4 * m;
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans += squarePerimeter;
            for(int i = 1; i < n; i++ ) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                ans += (squarePerimeter - 2 * (( m - x) + (m - y)));
            }
            System.out.println(ans);
        }
    }
}
