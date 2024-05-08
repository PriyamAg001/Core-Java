import java.util.Scanner;
import java.util.Stack;

public class pushOrPopValidOrInvalid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        boolean isValid = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                stack.push(1);
            }
            else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                stack.pop();
            }
        }
        System.out.println(isValid ? "Valid" : "Invalid");
    }
}
