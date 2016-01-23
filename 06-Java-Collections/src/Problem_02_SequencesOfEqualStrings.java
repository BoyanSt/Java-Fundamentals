import java.util.Scanner;

public class Problem_02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next();
        System.out.print(firstWord + " ");

        while (scanner.hasNext()){
            String nextWord = scanner.next();
            if (!firstWord.equals(nextWord)){
                System.out.println();
                System.out.print(nextWord + " ");
            }else{
                System.out.print(nextWord + " ");
            }
            firstWord=nextWord;
        }
    }
}
