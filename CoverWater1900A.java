import java.util.Scanner;

public class CoverWater1900A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            int longest = 0, running = 0;
            int count = 0;
            for(char ch : arr) {
                if(ch == '.') {
                    running += 1;
                    count++;
                } else {
                    longest = Math.max(running, longest);
                    running = 0;
                }
            }
            longest = Math.max(running, longest);
            if(longest >= 3) {
                System.out.println(2);
            } else {
                System.out.println(count);
            }
        }
    }
}
