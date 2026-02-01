import java.util.Scanner;

public class FollowingDirections1791B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int l = 0, r = 0;
            String s = sc.next();
            boolean pass = false;
            for(char c : s.toCharArray()) {
                switch(c) {
                    case 'U' : {
                        r++;
                        break;
                    }
                    case 'L' : {
                        l--;
                        break;
                    }
                    case 'R' : {
                        l++;
                        break;
                    }
                    case 'D' : {
                        r--;
                        break;
                    }
                }
                if(l == 1 && r == 1) {
                    pass = true;
                    break;
                }
            }
            if(pass) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
