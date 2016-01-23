package JavaExam_21_Sept_2014_Evening;


import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem_04_OfficeStuff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, LinkedHashMap<String,Integer>> listCompanies = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().replace("|","").replaceAll("\\s+","").split("-");
            String company = line[0];
            String product = line[2];
            int quantity = Integer.parseInt(line[1]);

            if (!listCompanies.containsKey(company)){
                listCompanies.put(company, new LinkedHashMap<>());
                listCompanies.get(company).put(product,quantity);
            } else {
                if (!listCompanies.get(company).containsKey(product)){
                    listCompanies.get(company).put(product,quantity);
                } else {
                    int existingQuantity = listCompanies.get(company).get(product);
                    listCompanies.get(company)
                            .put(product, existingQuantity + quantity);
                }
            }
        }

        for (String company : listCompanies.keySet()) {
            System.out.printf("%s: ",company);
            int counter = listCompanies.get(company).size();

            for (String product : listCompanies.get(company).keySet()) {
                if (counter!=1){
                    System.out.printf("%1$s-%2$d, ",product,listCompanies.get(company).get(product));
                } else {
                    System.out.printf("%1$s-%2$d ", product, listCompanies.get(company).get(product)).println();
                }
                counter--;
            }
        }
    }
}
