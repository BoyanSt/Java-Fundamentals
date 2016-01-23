import java.util.Scanner;

public class Problem_08_CountEqualBitPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String numBinary = Integer.toBinaryString(num);
        int countBitPairs = 0;

        for (int i = 0; i < numBinary.length() - 1; i++) {

            if ((numBinary.charAt(i) == '1' && numBinary.charAt(i + 1) == '1') ||
                    (numBinary.charAt(i) == '0' && numBinary.charAt(i + 1) == '0')) {
                countBitPairs++;
            }
        }

        System.out.println(countBitPairs);

    }
}
