package src;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuilder sb = new StringBuilder(s1);
        char ch = s1.charAt(0);
        if(Character.isLowerCase(ch)) {
            sb.setCharAt(0, Character.toUpperCase(ch));
        }
        System.out.println(sb);
    }
}
