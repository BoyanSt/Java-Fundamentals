import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstSide = scanner.nextDouble();
        double secondSide = scanner.nextDouble();

        double areaRectangle = firstSide * secondSide;

        System.out.println((int) areaRectangle);
    }
}
