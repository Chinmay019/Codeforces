import java.util.Scanner;

public class FoxAndSnake510A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] s = new char[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(i % 2 == 1)
                    s[i][j] = '.';
                else
                    s[i][j] = '#';
            }
        }
        for(int i = 1; i < n; i += 4) {
            s[i][m-1] = '#';
        }
        for(int i = 3; i < n; i += 4) {
            s[i][0] = '#';
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}
