import java.util.Scanner;

public class NeonNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        int sum = 0;
        while(square > 0){
            int rem = square % 10;
            sum += rem;
            square /= 10;
        }

        if(sum == n){
            System.out.println(n + " is a Neon Number");
        }
        else{
            System.out.println(n + " is not a Neon Number");
        }
    }
}