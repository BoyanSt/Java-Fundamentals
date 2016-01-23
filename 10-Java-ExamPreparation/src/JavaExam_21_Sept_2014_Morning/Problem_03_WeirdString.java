package JavaExam_21_Sept_2014_Morning;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_03_WeirdString {
    public static void main(String[] args) {

//        "\", "/", "(", ")", "|"
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine().trim()
                .replaceAll("\\s+","").replace("\\","")
                .replace("/", "").replace("(", "").replace(")", "").replace("|", "");
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(line);
        ArrayList<String> words = new ArrayList<>();

        while (matcher.find()){
            String currWord =  matcher.group();
            words.add(currWord);
        }

        long maxSum = Integer.MIN_VALUE;
        int indexWord = 0;

        for (int i = 0; i < words.size()-1; i++) {

            long sumFirstWord = 0, sumSecondWord = 0, sumFirstSecondNum;

            String firstWord = words.get(i).toLowerCase();
            String secondWord = words.get(i+1).toLowerCase();

            for (int j = 0; j < firstWord.length(); j++) {
                sumFirstWord += (firstWord.charAt(j)-96);
            }

            for (int j = 0; j < secondWord.length(); j++) {
                sumSecondWord +=(secondWord.charAt(j)-96);
            }

            sumFirstSecondNum = sumFirstWord + sumSecondWord;

            if (sumFirstSecondNum>=maxSum){
                maxSum = sumFirstSecondNum;
                indexWord = i;
            }
        }

        System.out.println(words.get(indexWord));
        System.out.println(words.get(indexWord+1));
    }
}
