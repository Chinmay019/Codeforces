package src;

import java.util.Arrays;
import java.util.Scanner;

public class MediumNumber1760A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int[] arr = new int[]{a,b,c};
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
