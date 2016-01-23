package JavaExam_3_Sept_2014;


import java.util.Scanner;

public class Problem_02_AddingAngles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] angels = new int[n];
        boolean isCircle = false;

        for (int i = 0; i < n; i++) {
            angels[i] = scan.nextInt();
        }

        for (int i = 0; i < angels.length; i++) {
            int firstAngle = angels[i];
            for (int j = i + 1; j < angels.length; j++) {
                int secondAngle = angels[j];
                for (int k = j + 1; k < angels.length; k++) {
                    int thirdAngle = angels[k];
                    int sumAngles = firstAngle + secondAngle + thirdAngle;

                    if (sumAngles % 360 == 0) {
                        System.out.printf("%1$d + %2$d + %3$d = %4$d degrees",
                                firstAngle, secondAngle, thirdAngle, sumAngles).println();
                        isCircle = true;
                    }
                }
            }
        }
        if (!isCircle) {
            System.out.println("No");
        }
    }
}
