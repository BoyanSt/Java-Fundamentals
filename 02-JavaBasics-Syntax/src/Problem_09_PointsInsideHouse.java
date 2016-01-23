import java.util.Scanner;

public class Problem_09_PointsInsideHouse {
    public static void main(String[] args) {


        double areaABC = Math.abs(12.5 * (8.5 - 3.5) + 22.5 * (3.5 - 8.5) + 17.5 * (8.5 - 8.5));
        System.out.println(areaABC);

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("END")) {

            double pointDX = scanner.nextDouble();
            double pointDY = scanner.nextDouble();
            double areaDBC = Math.abs(pointDX * (8.5 - 3.5) +
                    22.5 * (3.5 - pointDY) + 17.5 * (pointDY - 8.5));

            double areaABD = Math.abs(12.5 * (8.5 - pointDY) +
                    22.5 * (pointDY - 8.5) + pointDX * (8.5 - 8.5));

            double areaADC = Math.abs(12.5 * (pointDY - 3.5) +
                    pointDX * (3.5 - 8.5) + 17.5 * (8.5 - pointDY));

            boolean insideTrinagle = areaABC == areaABD + areaADC + areaDBC;

            // x [12.5, 17.5] || [20, 22.5] &&  y [8.5, 13.5]

            boolean insideRectangle = ((pointDX >= 12.5 && pointDX <= 17.5) ||
                    pointDX >= 20 && pointDX <= 22.5) &&
                    (pointDY >= 8.5 && pointDY <= 13.5);

            if (insideRectangle || insideTrinagle) {
                System.out.println("Inside");
            } else {
                System.out.println("Outside");
            }
        }
    }
}
