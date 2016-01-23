package JavaExam_21_Sept_2014_Morning;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Problem_01_Timespan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date startHour;
        Date endHour;

        try {
            startHour = dateFormat.parse(scan.nextLine());
            endHour = dateFormat.parse(scan.nextLine());
            long diffInMillies = startHour.getTime() - endHour.getTime();
            long diffSeconds = diffInMillies / 1000 % 60;
            long diffMinutes = diffInMillies / (60000) % 60;
            long diffHours = diffInMillies / (3600000);
            System.out.printf("%1$d:%2$02d:%3$02d",diffHours,diffMinutes,diffSeconds);

        } catch (Exception e){
            System.out.println("Invalid input format");
        }
    }
}
