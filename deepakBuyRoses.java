import java.util.Arrays;
import java.util.Scanner;

public class deepakBuyRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        Arrays.sort(arr);

        int low = 0;
        int high = n-1;
        int left = -1;
        int right = -1;
        while(low < high) {
            int sum = arr[low] + arr[high];
            if( sum > target){
                high--;
            }
            else if (sum < target) {
                low++;
            }
            else{
                left = low;
                right = high;
                break;
            }
        }
        if(left != -1 && right != -1)
            System.out.println("Deepak should buy roses whose prices are " + arr[left] + " and " + arr[right] + ".");
        else
            System.out.println("No pair of roses can be bought for the given amount.");
    }
}
