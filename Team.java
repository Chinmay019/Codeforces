package src;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        int count = 0, a, b ,c;
        for(int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if(a + b + c >= 2) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
