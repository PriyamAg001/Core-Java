import java.util.Arrays;
import java.util.Scanner;

public class checkPermutation {
    public static boolean arePermutation(String str1, String str2) {
        // If lengths are not same, the strings are not permutation of each other
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort the strings and compare
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.next();
        System.out.print("Enter the second string: ");
        String str2 = sc.next();

        if (arePermutation(str1, str2)) {
            System.out.println("1: " + str1 + " and " + str2 + " are permutable");
        }
        else {
            System.out.println("0: " + str1 + " and " + str2 + " are not permutable");
        }
    }
}