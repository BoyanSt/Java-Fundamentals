package JavaExam_3_Sept_2014;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_03_Biggest3PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        ArrayList<Integer> nums = new ArrayList<>();
        boolean isSumNums = false;

        Pattern pattern = Pattern.compile("\\b(?<!-)[0-9]+\\b");
        Matcher matcher = pattern.matcher(inputLine);

        while (matcher.find()) {
            int currNum = Integer.parseInt(matcher.group());
            boolean g = checkIsPrime(currNum);
            if (checkIsPrime(currNum)) {
                nums.add(currNum);
            }
        }
        int maxSum = Integer.MIN_VALUE;

        if (nums.size() < 3) {
            System.out.println("No");
        } else {
            for (int i = 0; i < nums.size() - 2; i++) {
                int firstNum = nums.get(i);
                for (int j = i + 1; j < nums.size() - 1; j++) {
                    int secondNum = nums.get(j);
                    for (int k = j + 1; k < nums.size(); k++) {
                        int thirdNum = nums.get(k);

                        if (firstNum == secondNum || firstNum == thirdNum || secondNum == thirdNum) {
                            continue;
                        }

                        int currSum = firstNum + secondNum + thirdNum;
                        if (currSum > maxSum) {
                            maxSum = currSum;
                            isSumNums = true;
                        }
                    }
                }
            }
            if (isSumNums) {
                System.out.println(maxSum);
            } else {
                System.out.println("No");
            }

        }
    }

    private static boolean checkIsPrime(int currNum) {
        boolean isPrimeNumber = true;
        int i = 2;

        while (i <= currNum / 2) {
            if (currNum % i == 0) {
                isPrimeNumber = false;
                break;
            }
            i++;
        }

        if (currNum == 0 || currNum == 1) {
            isPrimeNumber = false;
        }
        return isPrimeNumber;
    }
}
