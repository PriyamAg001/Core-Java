import java.util.*;

public class removePuntuationMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = str.replaceAll("\\p{Punct}", "");
        System.out.println(ans);
    }
}
