import java.util.Scanner;

public class elementPresentInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int element = sc.nextInt();
        boolean isPresent = false;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == element){
                    isPresent = true;
                    break;
                }
            }
        }

        if(isPresent){
            System.out.println("1, Element is Present");
        }
        else{
            System.out.println("0, Element is not Present");
        }
    }
}
