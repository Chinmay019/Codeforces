import java.util.Scanner;

public class EntertainmentInMAC1935A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int l = 0, r = s.length() - 1;
            while(l < r && s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }
            if(s.charAt(l) <= s.charAt(r)) {
                System.out.println(s);
            } else {
                String rev = new StringBuilder(s).reverse().toString();
                System.out.println(rev + s);
            }
        }
    }
}
