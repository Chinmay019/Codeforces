package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String full = sc.nextLine();
        if(full.startsWith("{") && full.endsWith("}")) {
            String content = full.substring(1, full.length() - 1);
            String[] items = content.split(",");
            Set<String> s = new HashSet<>();
            for(String item: items){
                if(!item.trim().isEmpty())
                    s.add(item.trim());
            }
            System.out.println(s.size());
        }
    }
}
