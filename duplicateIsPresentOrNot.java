import java.util.Arrays;
import java.util.Scanner;

public class duplicateIsPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");
    }
}
