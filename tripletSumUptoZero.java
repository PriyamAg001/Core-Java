import java.util.Arrays;
import java.util.Scanner;

public class tripletSumUptoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    System.out.println("1");
                    return;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        System.out.println("0");
    }
}
