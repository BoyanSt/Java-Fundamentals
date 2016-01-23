import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_06_CountSpecifiedWord {
    public static void main(String[] args) {
        Integer counter = 0;

        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String wordToSearch = scanner.next();
        String wordToSearchCapitalLetter = wordToSearch.substring(0,1).toUpperCase()+wordToSearch.substring(1);

        Pattern pattern = Pattern.compile("([ ,.!':;?'])*("+ wordToSearch +"|"+wordToSearchCapitalLetter+
                                          ")([ ,.!':;?'])");
        Matcher matcher = pattern.matcher(inputText);

        while(matcher.find()){
            counter++;
        }
        System.out.println(counter);

    }
}
