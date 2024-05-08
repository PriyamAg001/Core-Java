import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        while(str.length() > 0){
            char c = str.charAt(0);
            int count = 0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == c){
                    count++;
                }
            }
            ans += c + "" + count;
            str = str.replace("" + c, "");
        }
        System.out.println(ans);
    }
}
