import java.util.Scanner;

public class rectangleInsideCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int r = sc.nextInt();

        double rectangleDiagonal = Math.sqrt(w * w + h * h);
        double circleDiameter = 2 * r;

        if (circleDiameter >= rectangleDiagonal) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}