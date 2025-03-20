package src;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("0");
        } else {
            int compare = s1.toLowerCase().compareTo(s2.toLowerCase());
            if(compare > 0)
                System.out.println("1");
            else
                System.out.println("-1");
        }
    }
}
