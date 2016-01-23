package JavaExam_8_Feb_2015;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_04_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Integer>> usersList = new TreeMap<>();

        while (!line.equals("end")) {

            Pattern pattern = Pattern.compile("IP=(.+?(?<=m)).+?(?<=user=)(.+)");
            Matcher matcher = pattern.matcher(line);

            String ip = null, user = null;

            while (matcher.find()) {
                ip = matcher.group(1).replace(" m", "");
                user = matcher.group(2);
            }

            if (!usersList.containsKey(user)) {
                usersList.put(user, new LinkedHashMap<>());
                usersList.get(user).put(ip, 1);
            } else {
                if (!usersList.get(user).containsKey(ip)) {
                    usersList.get(user).put(ip, 1);
                } else {
                    usersList.get(user).put(ip, usersList.get(user).get(ip) + 1);
                }
            }

            line = scanner.nextLine();
        }

        for (String user : usersList.keySet()) {
            System.out.printf("%s: ", user).println();
            int count = usersList.get(user).size();

            for (String ip : usersList.get(user).keySet()) {

                if (count > 1) {
                    System.out.printf("%s => %d, ", ip, usersList.get(user).get(ip));
                } else {
                    System.out.printf("%s => %d.", ip, usersList.get(user).get(ip));
                }
                count--;
            }
            System.out.println();
        }
    }
}
