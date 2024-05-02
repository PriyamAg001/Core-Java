import java.util.Scanner;

public class maximumValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(maxi < arr[i]){
                maxi = Math.max(maxi, arr[i]);
            }
        }
        System.out.println(maxi);
    }
}