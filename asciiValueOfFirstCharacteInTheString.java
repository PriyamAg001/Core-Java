import java.util.Scanner;

public class asciiValueOfFirstCharacteInTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        System.out.print(words.length + " ");
        for (String word : words) {
            char firstChar = word.charAt(0);
            System.out.print(firstChar + "" + (int) firstChar + " ");
        }
    }
}
