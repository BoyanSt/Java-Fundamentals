package JavaExam_21_Sept_2014_Morning;


import java.util.ArrayList;
import java.util.Scanner;

public class Problem_02_MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long dNumber = Integer.parseInt(scan.nextLine());
        long biggestSum = Long.MIN_VALUE;
        int indexFirstElement = 0;
        int indexSecondElement = 0;
        int indexThirdElement = 0;

        ArrayList<Long> listNumbers = new ArrayList<>();

        String line = scan.nextLine();

        while (!line.equals("End")){
            long currNumber = Long.parseLong(line);
            listNumbers.add(currNumber);
            line = scan.nextLine();
        }


        for (int i = 0; i < listNumbers.size()-2; i++) {
            for (int j = i+1; j < listNumbers.size()-1; j++) {
                for (int k = j+1; k < listNumbers.size(); k++) {
                    long sumThreeNums = listNumbers.get(i)+listNumbers.get(j)+listNumbers.get(k);

                    if (sumThreeNums>biggestSum&&sumThreeNums%dNumber==0){
                        biggestSum=sumThreeNums;
                        indexFirstElement = i;
                        indexSecondElement = j;
                        indexThirdElement = k;
                    }
                }
            }
        }
        if (biggestSum==Long.MIN_VALUE){
            System.out.println("No");
            return;
        }

        System.out.printf("(%1$d + %2$d + %3$d)",
                listNumbers.get(indexFirstElement),
                listNumbers.get(indexSecondElement),
                listNumbers.get(indexThirdElement));
        System.out.print(" % ");
        System.out.printf("%d = 0",dNumber);

    }
}
