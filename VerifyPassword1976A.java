import java.util.Scanner;

public class VerifyPassword1976A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            boolean flag = false;
            for(int i = 1; i < n; i++) {
                // c-2 -> not allowed
                if(!Character.isDigit(arr[i - 1]) && Character.isDigit(arr[i])) {
                    flag = true;
                }
                // w-a -> not allowed
                else if(Character.isLowerCase(arr[i - 1]) && Character.isLowerCase(arr[i])) {
                    if(arr[i-1] > arr[i]) {
                        flag = true;
                    }
                } else if(Character.isDigit(arr[i - 1]) && Character.isDigit(arr[i])) {
                    if(arr[i] < arr[i-1]) {
                        flag = true;
                    }
                }
                if(flag)
                    break;
            }
            if(flag)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
