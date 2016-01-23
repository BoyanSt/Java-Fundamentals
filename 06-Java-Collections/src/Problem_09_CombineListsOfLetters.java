import java.util.ArrayList;
import java.util.Scanner;

public class Problem_09_CombineListsOfLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] firstInputLine = scanner.nextLine().replaceAll(" ","").toCharArray();
        char[] secondInputLine = scanner.nextLine().replace(" ", "").toCharArray();

        ArrayList<Character> firstCharList = new ArrayList<>();
        ArrayList<Character> secondCharList = new ArrayList<>();
        ArrayList<Character> outputList = new ArrayList<>();

        for (char ch : firstInputLine) {
            firstCharList.add(ch);
            outputList.add(ch);
        }

        for (char ch : secondInputLine) {
            secondCharList.add(ch);
        }

            for (Character character : secondCharList) {
                if (!firstCharList.contains(character)){
                    outputList.add(character);
                }
            }

        System.out.println(outputList);
    }
}
