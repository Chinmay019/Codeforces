import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpyDetected1512A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++ ) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            int spy = -1;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
                if(entry.getValue() == 1)
                    spy = entry.getKey();
            }
            for(int i = 0; i < n; i++ ) {
                if(arr[i] == spy) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
