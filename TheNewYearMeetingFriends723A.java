import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends723A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] arr = {n1, n2, n3};
        Arrays.sort(arr);
        int ans = (arr[1] - arr[0]) + (arr[2] - arr[1]);
        System.out.println(ans);
    }
}
