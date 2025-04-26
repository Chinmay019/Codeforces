import java.util.Scanner;

public class VadimsCollection2098A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            int[] freq = new int[10];
            for(char c : s.toCharArray()) {
                int digit = c - '0';
                freq[digit]++;
            }
            StringBuilder sb = new StringBuilder();
            while(sb.length() != 10) {
                int len = sb.length();
                int minNum = 9 - len;
                for(int i = minNum; i <= 9; i++) {
                    if(freq[i] > 0){
                        freq[i]--;
                        sb.append(i);
                        break;
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
