package src;

import java.util.*;

public class RegistrationSystem4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Set<String> users = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        while(t-- > 0) {
            String name = sc.next();
            if(!users.contains(name)) {
                users.add(name);
                map.put(name , 1);
                System.out.println("OK");
            } else {
                StringBuilder sb = new StringBuilder(name);
                int val = map.get(name);
                sb.append(val);
                System.out.println(sb);
                users.add(sb.toString());
                map.put(name, val + 1);
            }
        }
    }
}
