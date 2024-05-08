import java.util.Scanner;
public class reverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String reversedString = "";

        for (String word : words) {
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) {
                reverseWord += word.charAt(j);
            }
            reversedString += reverseWord + " ";
        }

        System.out.println(reversedString.trim());
    }
}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] words = str.split(" ");
//        StringBuilder reversedString = new StringBuilder();
//
//        for (String word : words) {
//            StringBuilder reverseWord = new StringBuilder();
//            for (int j = word.length()-1; j >= 0; j--) {
//                reverseWord.append(word.charAt(j));
//            }
//            reversedString.append(reverseWord).append(" ");
//        }
//
//        System.out.println(reversedString.toString().trim());
//    }
//}
