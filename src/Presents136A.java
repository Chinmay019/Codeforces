package src;

import java.util.HashMap;
import java.util.Scanner;

public class Presents136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 1;
        while(temp-- > 0) {
            int a = sc.nextInt();
            map.put(a, i++);
        }
        for(int a = 1; a <= n; a++ ) {
            System.out.print(map.get(a) + " ");
        }
    }
}
