import java.util.Scanner;

public class HowMuchDaytonaCost1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            boolean found = false;
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == k)
                    found = true;
            }
            if(found) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
