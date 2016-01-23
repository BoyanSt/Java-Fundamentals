import java.util.Scanner;

public class Problem_01_SymmetricNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();


        for (int i = startNumber; i <= endNumber ; i++) {
            boolean isSymmetricNum = true;

            String currNum = Integer.toString(i);

            for (int j = 0; j < currNum.length()-1 ; j++) {

                if (currNum.charAt(j)!=currNum.charAt(currNum.length()-j-1)){
                    isSymmetricNum=false;
                    break;
                }
            }
            if (isSymmetricNum){
                System.out.print(" "+currNum);
            }
        }
    }
}
