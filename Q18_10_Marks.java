import java.util.Scanner;

public class Q18_10_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        sc.close();

        int thousandsPlaceMin = Math.min(input1 / 1000, Math.min(input2 / 1000, input3 / 1000));
        int hundredsPlaceMax = Math.max((input1 / 100) % 10, Math.max((input2 / 100) % 10, (input3 / 100) % 10));
        int tensPlaceMin = Math.min((input1 / 10) % 10, Math.min((input2 / 10) % 10, (input3 / 10) % 10));
        int unitsPlaceMax = Math.max(input1 % 10, Math.max(input2 % 10, input3 % 10));

        int key = thousandsPlaceMin * 1000 + hundredsPlaceMax * 100 + tensPlaceMin * 10 + unitsPlaceMax;
        System.out.println(key);
    }
}
