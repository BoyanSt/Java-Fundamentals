import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem_01_SortArrayOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer inputNum = scanner.nextInt();
        Integer[] numbers = new Integer[inputNum];

        for (int i = 0; i < inputNum; i++) {
            numbers[i]=scanner.nextInt();
        }

//        products.stream()
//                .sorted((p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()))
//                .forEach(pro-> System.out.printf("%.2f %s\n", pro.getPrice(),pro.getName()));
        Arrays.stream(numbers)
                .sorted((num1,num2)->Integer.compare(num1,num2))
                .forEach(num-> System.out.println(num));

    }
}
