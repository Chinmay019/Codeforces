package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheGuy469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < x; i++ ) {
            set.add(sc.nextInt());
        }
        int y = sc.nextInt();
        for(int i = 0; i < y; i++ ) {
            set.add(sc.nextInt());
        }
        if(set.size() == n) {
            System.out.println("I become the guy.");
        }
        else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
