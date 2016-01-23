package JavaExam_7_Jan_2015;


import java.util.Scanner;

public class Problem_03_LegoBlocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLines = Integer.parseInt(scan.nextLine());

        String[][] firstMatrix = new String[numLines][];
        String[][] secondMatrix = new String[numLines][];
        boolean isLengthEqual = true;
        int totalElements = 0;

        for (int i = 0; i < numLines; i++) {
            firstMatrix[i] = scan.nextLine().trim().replace("\t", " ").split("\\s+");
            totalElements += firstMatrix[i].length;
        }

        for (int i = 0; i < numLines; i++) {
            secondMatrix[i] = scan.nextLine().trim().replace("\t", " ").split("\\s+");
            totalElements += secondMatrix[i].length;
        }

        int sumFirstTwoRows = firstMatrix[0].length + secondMatrix[0].length;

        for (int row = 1; row < firstMatrix.length; row++) {
            isLengthEqual = (firstMatrix[row].length + secondMatrix[row].length) == sumFirstTwoRows;

            if (!isLengthEqual) {
                break;
            }
        }

        if (isLengthEqual) {
            for (int row = 0; row < firstMatrix.length; row++) {
                System.out.print("[");

                for (int col1 = 0; col1 < firstMatrix[row].length; col1++) {
                    System.out.printf("%s, ", firstMatrix[row][col1]);
                }

                for (int col2 = secondMatrix[row].length - 1; col2 >= 0; col2--) {

                    if (col2 != 0) {
                        System.out.printf("%s, ", secondMatrix[row][col2]);
                    } else {
                        System.out.printf("%s]", secondMatrix[row][col2]);
                        System.out.println();
                    }
                }
            }
        } else {
            System.out.printf("The total number of cells is: %d", totalElements);
        }
    }
}
