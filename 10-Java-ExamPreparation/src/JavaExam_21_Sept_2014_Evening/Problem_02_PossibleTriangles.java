package JavaExam_21_Sept_2014_Evening;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_02_PossibleTriangles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayList<String> triangles = new ArrayList<>();


        while(!line.equals("End")){
            String[] sides = line.split("\\s+");
            BigDecimal[] numSides = new BigDecimal[sides.length];

            for (int i = 0; i < sides.length; i++) {
                numSides[i] = new BigDecimal(sides[i]);
            }

            Arrays.sort(numSides);
            BigDecimal a = numSides[0];
            BigDecimal b = numSides[1];
            BigDecimal c = numSides[2];

            if (a.add(b).compareTo(c)>0){
                triangles.add(String.format("%1$.2f+%2$.2f>%3$.2f", a, b, c));
            }
            line = scan.nextLine();
        }

        if (triangles.size()>0){
            for (String triangle : triangles) {
                System.out.println(triangle);
            }
        } else {
            System.out.println("No");
        }
    }
}
