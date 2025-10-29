import java.util.Scanner;

public class GiftCarpet1862A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt(); //rows
            int m = sc.nextInt(); //cols
            char[][] arr = new char[n][m];
            for(int i = 0; i < n; i++) {
                String s = sc.next();
                for(int j = 0; j < m; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }
            for(int j = 0; j < m; j++) { // fix col
                for(int i = 0; i < n; i++) { // iterate rows
                    if(arr[i][j] == 'v' && sb.isEmpty()) {
                        sb.append('v');
                        break;
                    } else if (arr[i][j] == 'i' && sb.length() == 1) {
                        sb.append('i');
                        break;
                    } else if (arr[i][j] == 'k' && sb.length() == 2) {
                        sb.append('k');
                        break;
                    } else if (arr[i][j] == 'a' && sb.length() == 3) {
                        sb.append('a');
                        break;
                    }
                }
            }
            if(sb.toString().equals("vika")) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
