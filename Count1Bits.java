import java.util.Scanner;

public class Count1Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.bitCount(n));
        int count = 0;
        while(n != 0) {
            count += n & 1;
            n >>= 1;
        }
        System.out.println(count);
    }
}
