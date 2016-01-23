import java.util.Scanner;

public class Problem_06_FormattingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();
        System.out.println(String.format("%10s", Integer.toBinaryString(firstNum)).replace(' ', '0'));


        System.out.printf("|%1$-10s|%2$10s|%3$10.2f|%4$-10.3f|",
                Integer.toHexString(firstNum).toUpperCase(),
                String.format("%10s", Integer.toBinaryString(firstNum)).replace(' ', '0'),
                secondNum,
                thirdNum);
    }
}
