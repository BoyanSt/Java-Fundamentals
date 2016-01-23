package JavaExam_21_Sept_2014_Evening;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_03_ValidUsernames {
    public static void main(String[] args) {

        ArrayList<String> users = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;
        int index = 0;
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();

        Pattern pattern = Pattern.compile("\\b[a-zA-Z]\\w{2,24}\\b");
        Matcher matcher = pattern.matcher(inputLine);

        while(matcher.find()){
            users.add(matcher.group());
        }

        for (int i = 0; i < users.size()-1; i++) {
            String firstUser = users.get(i);
            String nextUser = users.get(i+1);
            int currSum = firstUser.length()+nextUser.length();
            if (currSum > maxSum){
                maxSum = currSum;
                index = i;
            }
        }
        System.out.println(users.get(index));
        System.out.println(users.get(index+1));
    }
}
