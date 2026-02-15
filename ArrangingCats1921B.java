import java.util.Scanner;

public class ArrangingCats1921B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String f = sc.next();
            int def = 0, sur = 0;
            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == '0' && f.charAt(i) == '1') def++;
                else if(s.charAt(i) == '1' && f.charAt(i) == '0') sur++;
            }
            System.out.println(Math.max(def, sur));
        }
    }
}
