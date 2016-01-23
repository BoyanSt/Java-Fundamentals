package JavaExam_11_May_2015;

import java.util.Scanner;

public class Problem_03_LabyrinthDash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numLines = Integer.parseInt(scanner.nextLine());
        String[] textInput = new String[numLines];
        Integer longestInputLine = 0;

        for (int i = 0; i < numLines; i++) {
            textInput[i] = scanner.nextLine();
            if (textInput[i].length()>longestInputLine){
                longestInputLine=textInput[i].length();
            }
        }
        String commands = scanner.nextLine();

        char[][] matrix = new char[numLines][longestInputLine];
        for (int i = 0; i < matrix.length; i++) {
            String currLine = textInput[i];

            for (int j = 0; j < matrix[0].length && j < currLine.length(); j++) {
                matrix[i][j] = currLine.charAt(j);
            }
        }

        Integer row = 0, col = 0, playersLives = 3, counterMoves = 0;

        for (int i = 0; i < commands.length(); i++) {
            char currCommand = commands.charAt(i);



            switch (currCommand) {
                case '>': col++;
                    if (row>=matrix.length||row<0||col>=matrix[0].length||col<0||matrix[row][col]==' '){
                        counterMoves++;
                        System.out.println("Fell off a cliff! Game Over!");
                        System.out.printf("Total moves made: %d", counterMoves);
                        return;
                    }
                    if (matrix[row][col] == '|'||matrix[row][col]=='_') {
                        col--;
                        System.out.println("Bumped a wall.");
                        continue;
                    }
                    break;
                case '<': col--;
                    if (row>=matrix.length||row<0||col>=matrix[0].length||col<0||matrix[row][col]==' '){
                        counterMoves++;
                        System.out.println("Fell off a cliff! Game Over!");
                        System.out.printf("Total moves made: %d", counterMoves);
                        return;
                    }
                    if (matrix[row][col] == '|'||matrix[row][col]=='_') {
                        col++;
                        System.out.println("Bumped a wall.");
                        continue;
                    }
                    break;
                case '^': row--;
                    if (row>=matrix.length||row<0||col>=matrix[0].length||col<0||matrix[row][col]==' '){
                        counterMoves++;
                        System.out.println("Fell off a cliff! Game Over!");
                        System.out.printf("Total moves made: %d", counterMoves);
                        return;
                    }
                    if (matrix[row][col] == '|'||matrix[row][col]=='_') {
                        row++;
                        System.out.println("Bumped a wall.");
                        continue;
                    }
                    break;
                case 'v': row++;
                    if (row>=matrix.length||row<0||col>=matrix[0].length||col<0||matrix[row][col]==' '){
                        counterMoves++;
                        System.out.println("Fell off a cliff! Game Over!");
                        System.out.printf("Total moves made: %d", counterMoves);
                        return;
                    }
                    if (matrix[row][col] == '|'||matrix[row][col]=='_') {
                        row--;
                        System.out.println("Bumped a wall.");
                        continue;
                    }
                    break;
            }
            counterMoves++;
            char chToReturn = matrix[row][col];

            switch (chToReturn) {
                case '@':
                case '#':
                case '*': playersLives--;
                    if (playersLives>0) {
                        System.out.printf("Ouch! That hurt! Lives left: %d", playersLives).println();
                    } else {
                        System.out.printf("Ouch! That hurt! Lives left: %d", playersLives).println();
                        System.out.println("No lives left! Game Over!");
                        System.out.printf("Total moves made: %d", counterMoves);
                        return;

                    }
                    break;
                case '$': playersLives++;
                    matrix[row][col]='.';
                    System.out.printf("Awesome! Lives left: %d",playersLives).println();
                    break;
                case '.':
                    System.out.println("Made a move!");
                    break;
            }
        }
        System.out.printf("Total moves made: %d", counterMoves);

//        printMatrix(matrix);
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
