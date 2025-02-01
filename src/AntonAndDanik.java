package src;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a = 0, d = 0;
        for(char ch : s.toCharArray()) {
            if(ch == 'A') a++;
            if(ch == 'D') d++;
        }

        if(a > d){
            System.out.println("Anton");
        } else if (a < d) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
