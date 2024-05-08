import java.util.Scanner;

public class nearestMultipleof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n / 10) * 10;
        int b = a + 10;
        if((n - a)  > (b - n)){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}
