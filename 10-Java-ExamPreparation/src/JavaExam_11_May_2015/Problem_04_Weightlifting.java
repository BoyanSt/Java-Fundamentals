package JavaExam_11_May_2015;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Problem_04_Weightlifting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputLines = Integer.parseInt(scanner.nextLine());

        TreeMap<String,TreeMap<String,Long>> listPayersExercises = new TreeMap<>();

        for (int i = 0; i < numInputLines; i++) {
            String[] inputLineArr = scanner.nextLine().split(" ");

            String namePlayer = inputLineArr[0];
            String exercisePlayer = inputLineArr[1];
            long weightExercise = Integer.parseInt(inputLineArr[2]);

            if (!listPayersExercises.containsKey(namePlayer)){
                listPayersExercises.put(namePlayer,new TreeMap<>());
                listPayersExercises.get(namePlayer).put(exercisePlayer, weightExercise);

            } else {
                if (!listPayersExercises.get(namePlayer).containsKey(exercisePlayer)){
                    listPayersExercises.get(namePlayer).put(exercisePlayer,weightExercise);
                } else {
                    long totalWeight = listPayersExercises.get(namePlayer).get(exercisePlayer)+weightExercise;
                    listPayersExercises.get(namePlayer).put(exercisePlayer,totalWeight);
                }
            }
        }

        Set<String> keys = listPayersExercises.keySet();

        for (String name : keys) {

            TreeMap<String,Long> results = listPayersExercises.get(name);

            System.out.printf("%s : ",name);

            Set<String> exercises = results.keySet();

            boolean isFirst = true;

            for (String exercise : exercises) {
                long totalW = results.get(exercise);

                if (!isFirst) {
                    System.out.print(", ");
                }

                isFirst = false;
                System.out.printf("%s - %d kg",exercise, totalW);
            }
            System.out.println();
        }
//        System.out.println(listPayersExercises);
    }
}
