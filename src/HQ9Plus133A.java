package src;

import java.util.Scanner;

public class HQ9Plus133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        for(char ch : p.toCharArray()) {
            if(ch == 'H' || ch == 'Q' || ch == '9') {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
