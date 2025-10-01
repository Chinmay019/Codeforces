import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FootBall43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> freq = new HashMap<>();
        int n = sc.nextInt();
        while(n-- > 0) {
            String team = sc.next();
            freq.putIfAbsent(team, 0);
            freq.put(team, freq.get(team) + 1);
        }
        int max = 0;
        String[] ans = new String[1];
        for(Map.Entry<String, Integer> i : freq.entrySet()) {
            if(i.getValue() > max) {
                max = i.getValue();
                ans[0] = i.getKey();
            }
        }
        System.out.println(ans[0]);
    }
}
