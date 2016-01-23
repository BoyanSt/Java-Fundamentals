//Write a program to find the most frequent word in a text and print it, as well as how many times it appears in
//format "word -> count". Consider any non-letter character as a word separator. Ignore the character casing. If
//several words have the same maximal frequency, print all of them in alphabetical order. Examples:


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_11_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine().toLowerCase();

        TreeMap<String,Integer> resultMap = new TreeMap<>();

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(inputText);
        Integer maxValue = 0;

        while (matcher.find()){
            if (!resultMap.containsKey(matcher.group())){
                resultMap.put(matcher.group(),1);
            }else{
               Integer count =  resultMap.get(matcher.group());
                count++;
                if (count>maxValue){
                    maxValue=count;
                }
                resultMap.put(matcher.group(),count);
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : resultMap.entrySet()) {
            if (stringIntegerEntry.getValue()== maxValue){
                System.out.printf(stringIntegerEntry.getKey()+" -> " + maxValue + " times").println();
            }
        }
    }
}
