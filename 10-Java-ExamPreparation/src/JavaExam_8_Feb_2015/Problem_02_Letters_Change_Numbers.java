package JavaExam_8_Feb_2015;


import java.util.Scanner;

public class Problem_02_Letters_Change_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputStrings = scan.nextLine().split("\\s+");
        double totalSum =0;

        for (int i = 0; i < inputStrings.length; i++) {

            String currString = inputStrings[i];

            double currSum;
            double number = Double.parseDouble(currString.substring(1, currString.length() - 1));
            char firstLetter = currString.charAt(0);
            char secondLetter = currString.charAt(currString.length() - 1);

            if (firstLetter>=65&&firstLetter<=90){
                currSum = number/(firstLetter-64);
            } else {
                currSum = number*(firstLetter-96);
            }

            if (secondLetter>=65&&secondLetter<=90){
                currSum -= (secondLetter-64);
            } else {
                currSum += (secondLetter-96);
            }

            totalSum += currSum;
        }

        System.out.printf("%1$.2f",totalSum);
    }
}
