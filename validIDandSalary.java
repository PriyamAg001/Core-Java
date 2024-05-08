import java.util.Scanner;

public class validIDandSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String str = sc.next();
            int id = sc.nextInt();
            if(id <= 0){
                throw new IllegalArgumentException("Invalid ID");
            }

            int salary = sc.nextInt();
            if(salary < 0){
                throw new IllegalArgumentException("Invalid Salary");
            }

            System.out.println("Data Processed");
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
