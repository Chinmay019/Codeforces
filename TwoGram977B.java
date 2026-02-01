import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoGram977B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n - 1; i++) {
            String sub = s.substring(i , i + 2);
            if(!map.containsKey(sub)) {
                map.put(sub, 1);
            }
            map.put(sub, map.get(sub) + 1);
        }
        String ans = "";
        int max = 0;
        for(Map.Entry<String, Integer> i : map.entrySet()) {
            String key = i.getKey();
            int val = i.getValue();
            if(val > max) {
                max = val;
                ans = key;
            }
        }
        System.out.println(ans);
    }
}
