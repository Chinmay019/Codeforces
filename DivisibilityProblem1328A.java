package src;

import java.util.Scanner;

public class DivisibilityProblem1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] result = new int[t];
        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a % b == 0) {
                result[i] = 0;
            } else {
                result[i] = b - (a % b);
            }
        }
        for(int i : result)
            System.out.println(i);
    }
}
