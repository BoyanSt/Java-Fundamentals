package JavaExam_7_Jan_2015;


import java.util.Scanner;

public class Problem_03_FireTheArrows {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputCountLines = Integer.parseInt(scan.nextLine());
        int maxLenghtMatrix = 0;

        char[][] matrix = new char[inputCountLines][];

        for (int i = 0; i < inputCountLines; i++) {
            String currLine = scan.nextLine();
            matrix[i] = currLine.toCharArray();
            if (maxLenghtMatrix < currLine.length()) {
                maxLenghtMatrix = currLine.length();
            }
        }

        if (matrix.length > maxLenghtMatrix) {
            maxLenghtMatrix = matrix.length;
        }

        for (int iterMatrix = 0; iterMatrix < maxLenghtMatrix; iterMatrix++) {

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    char currChar = matrix[row][col];
                    char nextChar;

                    switch (currChar) {
                        case '>':
                            if (col != matrix[row].length - 1) {
                                nextChar = matrix[row][col + 1];
                                if (!checkIfNextArrow(nextChar)) {
                                    matrix[row][col] = 'o';
                                    matrix[row][col + 1] = '>';
                                }
                            }
                            break;
                        case '<':
                            if (col != 0) {
                                nextChar = matrix[row][col - 1];
                                if (!checkIfNextArrow(nextChar)) {
                                    matrix[row][col] = 'o';
                                    matrix[row][col - 1] = '<';
                                }
                            }
                            break;
                        case '^':
                            if (row != 0) {
                                nextChar = matrix[row - 1][col];
                                if (!checkIfNextArrow(nextChar)) {
                                    matrix[row][col] = 'o';
                                    matrix[row - 1][col] = '^';
                                }
                            }
                            break;
                        case 'v':
                            if (row != matrix.length - 1) {
                                nextChar = matrix[row + 1][col];
                                if (!checkIfNextArrow(nextChar)) {
                                    matrix[row][col] = 'o';
                                    matrix[row + 1][col] = 'v';
                                }
                            }
                            break;
                    }
                }
            }
        }
        printMatrix(matrix);
    }

    private static boolean checkIfNextArrow(char nextChar) {
        return nextChar == '>' || nextChar == '<' || nextChar == '^' || nextChar == 'v';
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
