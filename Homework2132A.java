import java.util.Scanner;

public class Homework2132A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            int n1 = sc.nextInt();
            String b = sc.next();
            StringBuilder sb = new StringBuilder(a);
            String order = sc.next();
            for(int i = 0; i < n1; i++) {
                char c = order.charAt(i);
                char ins = b.charAt(i);
                if(c == 'V') {
                    sb.insert(0, ins);
                } else {
                    sb.append(ins);
                }
            }
            System.out.println(sb);
        }
    }
}
