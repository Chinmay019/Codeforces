import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fir = sc.next();
        String sec = sc.next();
        String combined = fir + sec;
        String tar = sc.next();
        char[] c1 = combined.toCharArray();
        Arrays.sort(c1);
        String sFirst = new String(c1);
        char[] c2 = tar.toCharArray();
        Arrays.sort(c2);
        String sTar = new String(c2);
        if(sTar.equals(sFirst))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
