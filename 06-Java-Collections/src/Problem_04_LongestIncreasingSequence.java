
//Write a program to find all increasing sequences inside an array of integers. The integers are given in a single line,
//separated by a space. Print the sequences in the order of their appearance in the input array, each at a single line.
//Separate the sequence elements by a space. Find also the longest increasing sequence and print it at the last line.
//If several sequences have the same longest length, print the leftmost of them.

import java.util.Scanner;

public class Problem_04_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer globalCounter = 0;
        Integer indexElement= 0;

        String[] arrString = scanner.nextLine().split(" ");
        Integer[] numbersArr = new Integer[arrString.length];

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(arrString[i]);

        }

        for (int i = 0, countNextNum = 1; i < numbersArr.length; i++) {
            Integer currCounter = 0;
            Integer currNum = numbersArr[i];
            System.out.print(currNum + " ");

            while((i+countNextNum<numbersArr.length)&&currNum<numbersArr[i+countNextNum]){
                System.out.print(numbersArr[i+countNextNum]+" ");
                countNextNum++;
                currNum = numbersArr[countNextNum - 1];
                currCounter++;
            }
            System.out.println();

            if (currCounter>globalCounter){
                globalCounter=currCounter;
                indexElement = i;
            }

            i+=countNextNum-1;
            countNextNum=1;
        }

        System.out.print("Longest: ");

        for (int i = 0; i <= globalCounter; i++) {
            System.out.printf("%d ",numbersArr[indexElement+i]);
        }
    }
}
