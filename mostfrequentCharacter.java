import java.util.Scanner;

public class mostfrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] count = new int[256]; // ASCII size
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int maxCount = -1;
        char maxChar = ' ';
        for (char c : s.toCharArray()) {
            if (count[c] > maxCount) {
                maxCount = count[c];
                maxChar = c;
            }
        }

        System.out.println(maxChar);
    }
}
