package JavaExam_7_Jan_2015;


import java.util.ArrayList;
import java.util.Scanner;

public class Problem_01_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        int previousNumber = Integer.parseInt(scanner.nextLine().trim());
        sequence.add(previousNumber);

        for (int i = 1; i < n; i++) {
            String[] line = scanner.nextLine().trim().split("\\s+");

            int[] numbers = new int[line.length];

            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = Integer.parseInt(line[j]);
            }

            int minNumber = Integer.MAX_VALUE;
            boolean foundNumber = false;

            for (int j = 0; j < numbers.length; j++) {
                int currNumber = numbers[j];

                if (currNumber < minNumber && currNumber > previousNumber) {
                    minNumber = currNumber;
                    foundNumber = true;
                }
            }

            if (foundNumber) {
                sequence.add(minNumber);
                previousNumber = minNumber;
            } else {
                previousNumber++;
            }
        }
        System.out.println(sequence.toString().substring(1, sequence.toString().length() - 1));
    }
}
