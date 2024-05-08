import java.util.Scanner;

public class setE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sale = scanner.nextLine();
        int size = scanner.nextInt();
        scanner.nextLine(); // consume newline
        char[] productCode = new char[size];
        for (int i = 0; i < size; i++) {
            productCode[i] = scanner.next().charAt(0);
        }

        int totalSalesCount = 0;
        for (char c : sale.toCharArray()) {
            for (char desiredProduct : productCode) {
                if (c == desiredProduct) {
                    totalSalesCount += (int) c;
                }
            }
        }
        System.out.println(totalSalesCount);
    }
}
