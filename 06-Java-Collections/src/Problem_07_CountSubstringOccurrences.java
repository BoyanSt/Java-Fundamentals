import java.util.Scanner;

public class Problem_07_CountSubstringOccurrences {
    public static void main(String[] args) {

        Integer counter = 0;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String strToSearch = scanner.next();
        String strToSearchCapitalLetter = strToSearch.substring(0,1).toUpperCase() + strToSearch.substring(1);

        for (int i = 0; i+strToSearch.length() <= input.length(); i++) {
            String currString = input.substring(i,strToSearch.length()+i);
            if (currString.equals(strToSearch)||currString.equals(strToSearchCapitalLetter)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
