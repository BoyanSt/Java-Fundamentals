import java.util.Scanner;

public class Problem_02_TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pointAX = scanner.nextInt();
        int pointAY = scanner.nextInt();

        int pointBX = scanner.nextInt();
        int pointBY = scanner.nextInt();

        int pointCX = scanner.nextInt();
        int pointCY = scanner.nextInt();

        double area = Math.abs
                ((pointAX * (pointBY - pointCY) +
                        pointBX * (pointCY - pointAY) + pointCX * (pointAY - pointBY)) / 2);

        if (area > 0) {
            System.out.println(area);
        } else {
            System.out.println("0");
        }
    }
}
