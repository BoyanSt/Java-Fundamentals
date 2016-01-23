import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Problem_07_DaysBetweenTwoDates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstDateString = scanner.next();
        String secondDateString = scanner.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date startDate = new Date();
        Date endDate = new Date();

        try{
            startDate = formatter.parse(firstDateString);
            endDate = formatter.parse(secondDateString);

        }catch (ParseException ex){
            System.out.println("Invalid date.");
        }

        int diffInDays = (int)( (endDate.getTime() - startDate.getTime())/(1000 * 60 * 60 * 24) );
        System.out.println(diffInDays);

    }
}
