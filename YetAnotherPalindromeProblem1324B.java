import java.util.Scanner;

public class YetAnotherPalindromeProblem1324B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = false;
            for(int i = 0; i < n; i++){
                int first = arr[i];
                for(int j = i + 2; j < n; j++) {
                    if(arr[j] == first) {
                        flag = true;
                        break;
                    }
                }
                if(flag) break;
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
