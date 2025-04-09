import java.util.Scanner;

public class GameWithSticks451A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] grid = new int[n][m];
        int count = 1;
        for(int i = 0; i < n; i++ ) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = count++;
            }
        }
        int ans = 0; // 0 -> Akshat , 1 -> Malvika
        for(int i = 0; i < n; i++ ) {
            for(int j = 0; j < m; j++ ) {
                if(grid[i][j] != 0) {
                    removeSticks(grid , n , m , i , j);
                    ans++;
                }
            }
        }
        if(ans % 2 == 1) {
            System.out.println("Akshat");
        } else {
            System.out.println("Malvika");
        }
    }

    public static void removeSticks(int[][] grid, int n, int m, int row, int col) {
        for(int i = 0; i < m; i++ ) {
            grid[row][i] = 0;
        }
        for(int i = 0; i < n; i++) {
            grid[i][col] = 0;
        }
    }
}
