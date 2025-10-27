import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordonthePaper1850C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<String> result = new ArrayList<>();
        while(t-- > 0) {
            char[][] arr = new char[8][8];
            for(int i = 0; i < 8; i++) {
                String s = sc.nextLine();
                arr[i] = s.toCharArray();
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < 8; i++) {
                for(int j = 0; j < 8; j++) {
                    if(arr[i][j] != '.') {
                        while(i < 8 && arr[i][j] != '.' && arr[i][j] - 'a' >= 0) {
                            sb.append(arr[i][j]);
                            i++;
                        }
                        break;
                    }
                }
            }
            result.add(sb.toString());
        }
        for(String s : result) {
            System.out.println(s);
        }
    }
}
