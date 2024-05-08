import java.util.Arrays;

public class isAP {
    public static void main(String[] args) {
        System.out.println(isArithmeticProgression(new int[]{0, 12, 4, 8}) ? "YES" : "NO");
        System.out.println(isArithmeticProgression(new int[]{12, 40, 11, 20}) ? "YES" : "NO");
    }

    public static boolean isArithmeticProgression(int[] arr) {
        if (arr.length <= 2) {
            return true;
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
}
