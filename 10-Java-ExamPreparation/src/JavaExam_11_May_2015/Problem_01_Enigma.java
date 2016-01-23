package JavaExam_11_May_2015;

import java.util.Scanner;

public class Problem_01_Enigma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < num; i++) {
            String inputLine = scanner.nextLine();
            Integer lengthInputLine = inputLine.replaceAll("\\s+","").replaceAll("\\d+","").length();
//            System.out.println(inputLine);

            for (int j = 0; j < inputLine.length(); j++) {
                char charToChange = inputLine.charAt(j);
                Integer asciiNumCharToChange = (int)charToChange;

                if (asciiNumCharToChange!=32&&(asciiNumCharToChange<48||asciiNumCharToChange>57)){
                    Character changedChar = (char)((int)charToChange + lengthInputLine/2);
                    System.out.print(changedChar);
                }else{
                    System.out.print(charToChange);
                }
            }
            System.out.println();
        }
    }
}
