package src;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = (int) Math.ceil(t / 5.0);
        System.out.println(ans);
    }
}
