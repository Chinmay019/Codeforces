import java.util.Scanner;

public class ShortSort1873A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            String abc = "abc";
            int count = 0;
            for(int i =0 ;i < 3; i++) {
                if(s.charAt(i) != abc.charAt(i)) {
                    count++;
                }
            }
            if(count <= 2)
                System.out.println("yes");
            else System.out.println("no");
        }
    }
}
