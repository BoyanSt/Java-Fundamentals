package JavaExam_21_Sept_2014_Morning;


import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem_04_Nuts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String,LinkedHashMap<String,Integer>> listOrders = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String[] inputLine = scan.nextLine().split("\\s+");

            String company = inputLine[0];
            String nuts = inputLine[1];
            int amount = Integer.parseInt(inputLine[2].replace("kg",""));

            if (!listOrders.containsKey(company)){
                listOrders.put(company, new LinkedHashMap<>());
                listOrders.get(company).put(nuts, amount);
            } else {
                if (!listOrders.get(company).containsKey(nuts)){
                    listOrders.get(company).put(nuts,amount);
                } else {
                    listOrders.get(company).put(nuts,listOrders.get(company).get(nuts)+amount);
                }
            }
        }

        for (String company : listOrders.keySet()) {
            System.out.printf("%1$s: ",company);
            int count = listOrders.get(company).size();

            for (String nut : listOrders.get(company).keySet()) {

                    if (count!=1){
                        System.out.printf("%1$s-%2$dkg, ", nut, listOrders.get(company).get(nut));
                    } else {
                        System.out.printf("%1$s-%2$dkg", nut, listOrders.get(company).get(nut));
                    }
                    count--;
                }
            System.out.println();
            }
        }
    }

