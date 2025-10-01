import java.util.Scanner;

public class CreatingWords1985A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            char[] ac = a.toCharArray();
            char[] bc = b.toCharArray();
            char temp = ac[0];
            ac[0] = bc[0];
            bc[0] = temp;
            String a1 = new String(ac);
            String b1 = new String(bc);
            System.out.println(a1 + " " + b1);
        }
    }
}
