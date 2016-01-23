import java.util.Scanner;

public class Problem_05_DecimalToHexadecimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numInt = scanner.nextInt();

        String numHex = Integer.toHexString(numInt);

        System.out.println(numHex.toUpperCase());
    }
}

