package JavaExam_7_Jan_2015;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_02_TerroristsWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        StringBuilder text = new StringBuilder(line);
        Pattern pattern = Pattern.compile("\\|.+?(?<=\\|)");
        Matcher matcher = pattern.matcher(line);

        int bombStartIndex,
                bombEndIndex;

        while (matcher.find()) {
            bombEndIndex = matcher.end() - 1;
            bombStartIndex = matcher.start();
            String bomb = matcher.group().substring(1, matcher.group().length() - 1);

            int bombPower = 0;
            char[] arrMatchChars = bomb.toCharArray();

            for (int i = 0; i < arrMatchChars.length; i++) {
                bombPower += (int) (arrMatchChars[i]);
            }
            bombPower %= 10;

            int startIndex = Math.max(0, bombStartIndex - bombPower),
                    endIndex = Math.min(line.length() - 1, bombEndIndex + bombPower);

            while (startIndex <= endIndex) {
                text.setCharAt(startIndex, '.');
                startIndex++;
            }
        }

        System.out.println(text);
    }
}
