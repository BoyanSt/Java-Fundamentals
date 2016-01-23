import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Demos {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("BG","BG"));
        Person person = new Person("Stoy",100);
        System.out.println(person);

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        while (!scanner.hasNext("END")){
            if (scanner.hasNextInt()){
                nums.add(scanner.nextInt());
            }
            else {
                scanner.next();
            }
        }

        System.out.println(nums);

        String[] arr = {"aa","bb","cc"};
        System.out.println(String.join(": ",arr));
        Object dataContainer = 5;
        dataContainer = new Person("Ivan",100);

        System.out.println(dataContainer);

        char ch = "fg".charAt(0);
        System.out.println(ch);

        boolean fr = true;
        System.out.println(fr);

        System.out.println(!fr);
        System.out.println('\u03A9');

        float a = 12.34F;
        float b = 12.66F;
        BigDecimal bigF = new BigDecimal("12.34");
        BigDecimal bigM = new BigDecimal("12.66");

        double sumFM = a+b;

        BigDecimal sum = new BigDecimal("12.34").add(new BigDecimal("12.66"));


        System.out.println(sum);
        System.out.println(sumFM);
    }
}
