import java.util.ArrayList;
import java.util.Scanner;

public class kthElementFromTheLastInLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num = sc.nextInt();
        while(num != -1){
            list.add(num);
            num = sc.nextInt();
        }

        int k = sc.nextInt();
        if(k <= list.size()){
            System.out.println(list.get(list.size() - k));
        }
        else{
            System.out.println("The linked list does not have " + k + " elements.");
        }
    }
}
