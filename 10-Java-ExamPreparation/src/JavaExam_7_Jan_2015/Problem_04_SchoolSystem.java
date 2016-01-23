package JavaExam_7_Jan_2015;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem_04_SchoolSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, TreeMap<String, ArrayList<Double>>> listStudents = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().trim().split("\\s+");
            String nameStudent = input[0] + " " + input[1];
            String subject = input[2];
            double grade = Double.parseDouble(input[3]);

            if (!listStudents.containsKey(nameStudent)) {
                listStudents.put(nameStudent, new TreeMap<>());
                listStudents.get(nameStudent).put(subject, new ArrayList<>());
                listStudents.get(nameStudent).get(subject).add(grade);
            } else {
                if (!listStudents.get(nameStudent).containsKey(subject)) {
                    listStudents.get(nameStudent).put(subject, new ArrayList<>());
                    listStudents.get(nameStudent).get(subject).add(grade);
                } else {

                    listStudents.get(nameStudent).get(subject).add(grade);
                }
            }
        }

        for (String student : listStudents.keySet()) {
            System.out.printf("%s: [", student);

            ArrayList<String> subjects = new ArrayList<>();

            for (String subj : listStudents.get(student).keySet()) {
                double averageGrade = 0;
                int countGrades = listStudents.get(student).get(subj).size();

                for (int i = 0; i < countGrades; i++) {
                    averageGrade += listStudents.get(student).get(subj).get(i);
                }


                averageGrade /= countGrades;
                subjects.add(String.format("%1s - %2$.2f", subj, averageGrade));
            }
            System.out.print(String.join(", ", subjects));
            System.out.println("]");
        }
    }
}
