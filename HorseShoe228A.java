package src;

import java.util.Arrays;
import java.util.Scanner;

public class HorseShoe228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++ ) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        if(arr[0] == arr[1])
            count++;
        if(arr[1] == arr[2])
            count++;
        if(arr[2] == arr[3])
            count++;
        System.out.println(count);
    }
}
