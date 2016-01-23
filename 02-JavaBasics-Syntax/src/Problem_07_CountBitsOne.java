import java.util.Scanner;

public class Problem_07_CountBitsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String numBinary = Integer.toBinaryString(num);

        int counterBits = 0;

        for (int i = 0; i < numBinary.length(); i++) {

            if (numBinary.charAt(i) == '1') {
                counterBits++;
            }
        }
        System.out.println(counterBits);
    }
}
