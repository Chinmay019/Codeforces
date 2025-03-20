package src;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(char ch : inp.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u' || lower == 'y' ) {
                continue;
            }
            else {
                sb.append('.');
                sb.append(lower);
            }
        }
        System.out.println(sb);
    }
}
