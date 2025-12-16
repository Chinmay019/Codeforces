import java.util.Scanner;

public class StrongPassword1997A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            boolean inserted = false;
            if(sb.length() == 1) {
                if(sb.charAt(0) == 'a') {
                    sb.append('z');
                } else {
                    sb.append('a');
                }
                inserted = true;
            }
            for(int i = 1; i < sb.length(); i++) {
                if(sb.charAt(i) == sb.charAt(i - 1)) {
                    if(sb.charAt(i) == 'a') {
                        sb.insert(i , 'z');
                    } else {
                        sb.insert(i, 'a');
                    }
                    inserted = true;
                    break;
                }
            }
            if(!inserted) {
                if(sb.charAt(sb.length() - 1) == 'a')
                    sb.append('s');
                else
                    sb.append('a');
            }
            System.out.println(sb);
        }
    }
}
