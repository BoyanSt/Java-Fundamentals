package JavaExam_21_Sept_2014_Evening;

import java.util.Scanner;

public class Problem_01_MirrorNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] nums = scan.nextLine().split("\\s+");
        boolean isMirrorNums = false;
        String g = new StringBuffer("gg1").reverse().toString();


        for (int i = 0; i < nums.length; i++) {
            String currNum = nums[i];

            for (int j = i+1; j < nums.length; j++) {
                String nextNum = nums[j];
                String nextNumRotated = "";
                for (int k = nextNum.length()-1; k >=0 ; k--) {
                    nextNumRotated+=nextNum.charAt(k);
                }

                if (currNum.equals(nextNumRotated)&&!currNum.equals(nextNum)){
                    System.out.printf("%1$s<!>%2$s",currNum,nextNum).println();
                    isMirrorNums = true;
                }
            }
        }
        if (!isMirrorNums){
            System.out.println("No");
        }
    }
}
