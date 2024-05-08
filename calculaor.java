import java.util.Scanner;

public class calculaor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            if (num1 < 1) {
                throw new ArithmeticException();
            }

            try {
                int num2 = sc.nextInt();
                if (num2 < 1) {
                    throw new ArithmeticException();
                }
                System.out.println(num1 + num2);
                System.out.println(num1 - num2);
                System.out.println(num1 * num2);
                System.out.println(num1 / num2);
            }

            catch(ArithmeticException e) {
                System.out.println("Second number is zero");
            }
        }
        catch (ArithmeticException e){
            System.out.println("First number is zero");
        }
        catch(Exception e){
            System.out.println("Non-Integer Input");
        }
    }
}

