package src;

import java.util.Scanner;

public class AplusBAgain1999A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ans = new int[t];
        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            ans[i] = getSum(a);
        }
        for(int a : ans)
            System.out.println(a);
    }
    public static int getSum(int i) {
        String s = String.valueOf(i);
        int sum = 0;
        for(char ch: s.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(ch));
        }
        return sum;
    }
}
