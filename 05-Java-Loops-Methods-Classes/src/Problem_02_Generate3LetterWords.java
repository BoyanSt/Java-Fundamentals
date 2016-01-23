import java.util.Scanner;

public class Problem_02_Generate3LetterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbols[] = scanner.next().toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols.length ; j++) {
                for (int k = 0; k < symbols.length ; k++) {
                    System.out.print(""+symbols[i]+symbols[j]+symbols[k]+" ");
                }
            }
        }
    }
}
