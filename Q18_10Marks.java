import java.util.Scanner;

public class Q18_10Marks {
    public static int solve(int n, int[] arr, int health1, int health2){
        int count = 0;
        for(int i=0; i<n; i++){
            if((health1 % arr[i] == 0) && (health2 % arr[i] == 0)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int health1 = sc.nextInt();
        int health2 = sc.nextInt();

        System.out.println(solve(n, arr, health1, health2));
    }
}
