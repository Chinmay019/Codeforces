import java.util.Scanner;

public class SerejaAndDima381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int left = 0, right = n - 1, turn = 0;
        int sereja = 0, dima = 0;

        while(turn < n) {
            int val = -1;
            if(arr[left] > arr[right]) {
                val = arr[left++];
            } else {
                val = arr[right--];
            }
            if(turn % 2 == 0)
                sereja += val;
            else dima += val;
            turn++;
        }
        System.out.println(sereja + " " + dima);
    }
}
