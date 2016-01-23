package JavaExam_4_Oct_2015;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_2_DragonAccounting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double initialCapital = Double.parseDouble(scan.nextLine());
        String line = scan.nextLine();
        //{hired};{fired};{salary};{additional events:money}
        //            ((salary / 30) * totalWorkingDaysThatMonth)
        ArrayList<String> inputData = new ArrayList<>();
        double totalDays = 0;


        while (!line.equals("END")) {
            inputData.add(line);
            line = scan.nextLine();
            totalDays++;
        }

        for (int i = 0; i < inputData.size(); i++) {
            String[] currData = inputData.get(i).split(";");

            double peopleHired = Double.parseDouble(currData[0]);
            double peopleFired = Double.parseDouble(currData[1]);
            double salary = Double.parseDouble(currData[2]);


            ArrayList<Employee> listEmployees = new ArrayList<>();

            for (int j = 0; j < peopleHired; j++) {
                listEmployees.add(new Employee(salary));
            }
            checkForRise(listEmployees);

            if (i % 30 == 0) {
                double salaries = 0;
                for (Employee employee : listEmployees) {
                    salaries += (employee.salary / 30) / employee.daysAtWork;
                }
                initialCapital -= salaries;
            }

            for (int j = 0; j < peopleFired; j++) {
                listEmployees.remove(j);
            }

            for (int j = 3; j < currData.length; j++) {
                String[] currSrt = currData[j].split(":");
                String additionalEvents = currSrt[0];

                if (isExpence(additionalEvents)) {
                    initialCapital -= Double.parseDouble(currData[1]);
                } else {
                    initialCapital += Double.parseDouble(currData[1]);
                }
            }

            if (initialCapital <= 0) {
                System.out.printf("BANKRUPTCY: %f", initialCapital);
                return;
            }

            for (Employee employee : listEmployees) {
                employee.daysAtWork++;
            }


        }
    }

    private static void checkForRise(ArrayList<Employee> listEmployees) {
        for (Employee employee : listEmployees) {
            if (employee.daysAtWork % 366 == 0 && employee.daysAtWork > 0) {
                employee.salary *= 1.6;
            }
        }
    }

    private static boolean isExpence(String additionalEvents) {

        switch (additionalEvents) {
            case "Previous years deficit":
                return true;
            case "Machines":
                return true;
            case "Taxes":
                return true;
            default:
                return false;
        }
    }

    public static class Employee {
        double salary;
        long daysAtWork;

        public Employee(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public long getDaysAtWork() {
            return daysAtWork;
        }

        public void setDaysAtWork(long daysAtWork) {
            this.daysAtWork = daysAtWork;
        }
    }
}
