import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two interger numbers:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.print("The sum of the numbers is ");
        System.out.println(firstNumber + secondNumber);

    }
}
