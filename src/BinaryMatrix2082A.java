package src;

import java.util.Scanner;

public class BinaryMatrix2082A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
            int[] count_rows = new int[n];
            int[] count_cols = new int[m];
            for(int i = 0; i < n; i++ ) {
                String row = sc.next();
                for(int j = 0; j < m; j++ ) {
                    char ch = row.charAt(j);
                    int val = Integer.parseInt(String.valueOf(ch));
                    matrix[i][j] = val;
                }
            }
            for(int i = 0; i < n; i++ ) {
                int one_count = 0;
                for(int j = 0; j < m; j++ ) {
                    if(matrix[i][j] == 1)
                        one_count = (one_count + 1) % 2;
                }
                count_rows[i] = one_count % 2;
            }
            for(int i = 0; i < m; i++ ) {
                int col_one_count = 0;
                for(int j = 0; j < n; j++ ) {
                    if(matrix[j][i] == 1)
                        col_one_count = (col_one_count + 1) % 2;
                }
                count_cols[i] = col_one_count % 2;
            }

            int row_sum = 0, col_sum = 0;
            for(int i = 0; i < n; i++ ) {
                row_sum += count_rows[i];
            }
            for(int i = 0; i < m; i++) {
                col_sum += count_cols[i];
            }
            System.out.println(Math.max(row_sum, col_sum));
        }
    }
}
