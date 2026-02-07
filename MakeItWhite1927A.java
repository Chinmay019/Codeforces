import java.util.Scanner;

public class MakeItWhite1927A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int l = 0, r = n - 1;
            while(l <= r) {
                if(s.charAt(l) != 'W' && s.charAt(r) != 'W') break;
                if(s.charAt(l) == 'W') l++;
                if(s.charAt(r) == 'W') r--;
            }
            System.out.println(r - l + 1);
        }
    }
}
