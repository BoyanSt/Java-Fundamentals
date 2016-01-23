import com.sun.deploy.util.OrderedHashSet;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_10_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(inputText);

        TreeSet<String> resultSet = new TreeSet<>();

        while(matcher.find()){
            resultSet.add(matcher.group());
        }

        System.out.println(resultSet);
    }
}