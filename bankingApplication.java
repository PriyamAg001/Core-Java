import java.awt.*;
import java.util.Scanner;

public class bankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int depositAmmount = sc.nextInt();
            int withdrawAmmount = sc.nextInt();
            int remainingAmmount = depositAmmount - withdrawAmmount;
            if (withdrawAmmount < depositAmmount) {
                System.out.println("Withdrwal Successful. Available Balance: " + remainingAmmount);
            }
            else {
                throw new IllegalArgumentException("Withdrawal Unsuccessful");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
