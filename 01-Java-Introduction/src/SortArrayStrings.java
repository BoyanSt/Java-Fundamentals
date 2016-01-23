import java.lang.reflect.Array;
import java.util.Scanner;

public class SortArrayStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLenght = scanner.nextInt();

        String arrStr[] = new String[arrayLenght];

        for (int i = 0; i < arrayLenght ; i++) {
            arrStr[i] = scanner.next();
        }

        for (int i = 0; i < arrStr.length ; i++) {

            for (int j = i + 1; j < arrStr.length; j++) {

                if (arrStr[j].compareTo(arrStr[i]) < 0) {

                    String tempStr = arrStr[i];

                    arrStr[i] = arrStr[j];
                    arrStr[j] = tempStr;
                }
            }
        }

        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(arrStr[i] + " ");
        }
    }
}
