import java.util.Scanner;

public class characterWithMostFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char maxChar = ' ';
        int maxCount = 0;
        int[] freq = new int[256];
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                freq[str.charAt(i)]++;
            }
        }

        for(int i=0; i<str.length(); i++){
            if(maxCount < freq[str.charAt(i)]){
                maxCount = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }
        System.out.println(maxCount + " " + maxChar);
    }
}
