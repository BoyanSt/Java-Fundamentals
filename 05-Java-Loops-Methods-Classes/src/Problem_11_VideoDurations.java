import java.util.Scanner;

public class Problem_11_VideoDurations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        double totalHours = 0;
        double totalMinutes = 0;

        while(!inputLine.contains("End")){
            String[] dataTime = inputLine.split(":");
            double currHours = Double.parseDouble(dataTime[0]);
            double currMinutes = Double.parseDouble(dataTime[1]);

            totalHours+=currHours;
            totalMinutes+=currMinutes;

            inputLine = scanner.nextLine();
        }

        int minToHours = (int)totalMinutes/60;
        totalHours += minToHours;
        int minOutPut = (int)totalMinutes%60;

        System.out.printf("%1$d:%2$02d",(int)totalHours,minOutPut);

    }
}
