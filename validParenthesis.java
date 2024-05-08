import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public static boolean balancedParenthesis(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else if(c == ')'){
                if(st.empty() || st.peek() != '('){
                    return false;
                }
                st.pop();
            }
            else if(c == '}'){
                if(st.empty() || st.peek() != '{'){
                    return false;
                }
                st.pop();
            }
            else if(c == ']'){
                if(st.empty() || st.peek() != '['){
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ans = balancedParenthesis(str);
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}