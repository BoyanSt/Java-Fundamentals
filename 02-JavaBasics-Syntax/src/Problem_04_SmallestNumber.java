import java.util.Scanner;

public class Problem_04_SmallestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();

        if (firstNum < secondNum) {
            if (firstNum < thirdNum) {
                System.out.println(firstNum);
            } else {
                System.out.println(thirdNum);
            }
        } else {
            if (secondNum < thirdNum) {
                System.out.println(secondNum);
            } else {
                System.out.println(thirdNum);
            }
        }
    }
}
