package src;

import java.util.Arrays;
import java.util.Scanner;

public class Expression479A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int e1 = a + b + c;
        int e2 = a * b * c;
        int e3 = (a + b) * c;
        int e4 = a * (b + c);
        int e5 = a + b * c;
        int e6 = a * b + c;
        int[] arr = {e1, e2, e3, e4, e5, e6};
        Arrays.sort(arr);
        System.out.println(arr[5]);
    }
}
