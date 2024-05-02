import java.util.Scanner;

public class checkDivisiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n%11) == 0) {
            System.out.println("Eleven");
        }
        else if((n%3) == 0){
            System.out.println("Three");
        }
        else if((n%2) == 0){
            System.out.println("Two");
        }
        else {
            System.out.println("-1");
        }
    }
}