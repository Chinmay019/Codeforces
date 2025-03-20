package src;

import java.util.HashSet;
import java.util.Scanner;

public class BoyGirl {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        for(char ch : name.toCharArray()) {
            set.add(ch);
        }

        if(set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
