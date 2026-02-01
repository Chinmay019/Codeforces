import java.util.Scanner;

public class PrependAndAppend1791C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int l = 0, r = n - 1;
            while(l < r) {
                if(s.charAt(l) != s.charAt(r)) {
                    l++;
                    r--;
                } else break;
            }
            System.out.println(r - l + 1);
        }
    }
}
