package JavaExam_3_Sept_2014;


import java.util.Scanner;

public class Problem_01_DozensOfEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dozensEggs = 0;
        int eggs = 0;
        int numDaysOfWeek = 7;

        for (int i = 0; i < numDaysOfWeek; i++) {
            String[] line = scan.nextLine().split("\\s+");
            String measure = line[1];
            int count = Integer.parseInt(line[0]);

            if (measure.equals("dozens")) {
                dozensEggs += count;
            } else {
                eggs += count;
            }
        }

        dozensEggs += eggs / 12;
        eggs %= 12;
        System.out.printf("%1$d dozens + %2$d eggs", dozensEggs, eggs);
    }
}
