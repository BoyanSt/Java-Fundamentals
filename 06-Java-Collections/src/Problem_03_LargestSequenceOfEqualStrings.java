import java.util.Scanner;

public class Problem_03_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArr = scanner.nextLine().split(" ");

        Integer globalCounter = 0;
        Integer indexElement= 0;

        for (int i = 0,count=1; i < stringArr.length; i++) {
            Integer currCounter = 0;
            String currStr = stringArr[i];
            while (((i+count)<stringArr.length)&&currStr.equals(stringArr[i+count])){
                currCounter++;
                count++;
            }
            if (currCounter>globalCounter){
                globalCounter=currCounter;
                indexElement = i;
            }
            i+=count-1;
            count = 1;
        }
        for (int i = 0; i <= globalCounter; i++) {
            System.out.printf("%s ",stringArr[indexElement]);
        }
    }
}
