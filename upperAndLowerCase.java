import java.util.Scanner;

public class upperAndLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                ans += Character.toLowerCase(c);
            }
            else{
                ans += Character.toUpperCase(c);
            }
        }
        System.out.println(ans);
    }
}
