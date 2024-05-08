import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class squareOfEachElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum = arr[i] * arr[i];
            arr[i] = sum;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
