import java.util.Scanner;

public class ShortSubstrings1367A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String inp = sc.next();
            StringBuilder sb = new StringBuilder();
            sb.append(inp, 0, 2);
            for(int i = 3; i < inp.length(); i += 2) {
                sb.append(inp.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
