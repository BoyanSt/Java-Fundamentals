
//Write a program to count the number of words in given sentence. Use any non-letter character as word separator.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_05_CountAllWords {
    public static void main(String[] args) {
        Integer count = 0;

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(inputStr);

        while(matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
