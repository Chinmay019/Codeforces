import java.util.Scanner;

public class CipherShifer1840A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n; i++) {
                char ch = arr[i];
                sb.append(ch);
                do {
                    i++;
                } while (i < n && arr[i] != ch);
            }
            System.out.println(sb);
        }
    }
}
