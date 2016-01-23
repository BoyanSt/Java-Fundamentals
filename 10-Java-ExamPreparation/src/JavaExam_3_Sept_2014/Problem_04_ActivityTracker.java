package JavaExam_3_Sept_2014;


import java.util.Scanner;
import java.util.TreeMap;

public class Problem_04_ActivityTracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<Integer, TreeMap<String, Integer>> activityList = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("\\s+");
            String user = line[1];
            int distance = Integer.parseInt(line[2]);
            int month = Integer.parseInt(line[0].substring(3, 5));
            if (!activityList.containsKey(month)) {
                activityList.put(month, new TreeMap<>());
                activityList.get(month).put(user, distance);
            } else {
                if (!activityList.get(month).containsKey(user)) {
                    activityList.get(month).put(user, distance);
                } else {
                    int previousDistance = activityList.get(month).get(user);
                    activityList.get(month).put(user, previousDistance + distance);
                }
            }
        }

        for (Integer month : activityList.keySet()) {
            System.out.printf("%d: ", month);
            int count = activityList.get(month).size();

            for (String user : activityList.get(month).keySet()) {

                if (count != 1) {
                    System.out.printf("%1$s(%2$d), ", user, activityList.get(month).get(user));
                } else {
                    System.out.printf("%1$s(%2$d)", user, activityList.get(month).get(user)).println();
                }
                count--;
            }
        }
    }
}
