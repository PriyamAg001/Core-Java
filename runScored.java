import java.util.InputMismatchException;
import java.util.Scanner;

public class runScored {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter Run Scored: ");
            int totalRun = sc.nextInt();
            System.out.print("Enter Overs Played: ");
            int totalOver = sc.nextInt();
            System.out.print("Run Rate: ");
            float runrate = (float) (totalRun / totalOver);
            System.out.println(runrate);
        }
        catch(ArithmeticException | InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
    }
}
