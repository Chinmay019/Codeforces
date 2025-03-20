package src;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = 0, u = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isLowerCase(ch)) l++;
            else u++;
        }

        if(l >= u)
            System.out.println(s.toLowerCase());
        else {
            System.out.println(s.toUpperCase());
        }
    }
}
