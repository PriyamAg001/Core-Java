import java.util.Scanner;

public class evenoddindexString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String even = "";
        String odd = "";
        String ans = "";

        for(int i=0; i<str.length(); i++){
            if(i % 2 == 0){
                even += str.charAt(i);
            }
            else{
                odd += str.charAt(i);
            }
        }
        ans = even + odd;
        System.out.println(ans);
    }
}
