import java.util.Scanner;

public class NotAdjacentMatrix1520C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            if(n == 1) {
                System.out.println("1");
            } else if(n == 2) {
                System.out.println("-1");
            } else {
                int max = n * n;
                int value = 1;
                int[][] grid = new int[n][n];
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        grid[i][j] = value;
                        value += 2;
                        if(value > max) value = 2;
                    }
                }
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++)
                        System.out.print(grid[i][j] + " ");
                    System.out.println();
                }
            }

        }
    }
}
