import java.util.Scanner;

public class maxAndMinAndSubinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(maxi < arr[i]){
                maxi = arr[i];
            }

            if(arr[i] < mini){
                mini = arr[i];
            }
        }
        System.out.println(maxi);
        System.out.println(mini);

        int sub = arr[0];
        for(int i=1; i<n; i++){
            sub -= arr[i];
        }
        System.out.println(sub);

        if(sub >= 0){
            System.out.println("Subtraction result is greater than or equal to Zero");
        }
        else{
            System.out.println("Subtraction result is less than Zero");
        }
    }
}
