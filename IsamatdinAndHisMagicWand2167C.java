import java.util.*;

public class IsamatdinAndHisMagicWand2167C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            boolean hasEven = false, hasOdd = false;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0) hasEven = true;
                else hasOdd = true;
            }
            if(hasEven && hasOdd)
                Arrays.sort(arr);
            for(int i: arr) System.out.print(i+ " ");
            System.out.println();
        }
    }
}
