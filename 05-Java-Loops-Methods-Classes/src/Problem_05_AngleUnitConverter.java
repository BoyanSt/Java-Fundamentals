import java.util.Scanner;

public class Problem_05_AngleUnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        while (num!=0){

            double valueAngle = scanner.nextDouble();
            String typeAngle = scanner.next();

            if (typeAngle.contains("deg")){
                double changedValueAngle = (valueAngle/180)*Math.PI;
                System.out.printf("%1$.6f %2$s",changedValueAngle,"rad");
            }else{
                double changedValueAngel = (valueAngle*180)/Math.PI;
                System.out.printf("%1$.6f %2$s",changedValueAngel,"deg");
            }
            num--;
        }
    }
}
