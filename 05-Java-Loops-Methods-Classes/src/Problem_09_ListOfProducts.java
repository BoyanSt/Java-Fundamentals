import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem_09_ListOfProducts {
    public static void main(String[] args) throws IOException {

        ArrayList<Product> products = new ArrayList<>();

        try {
            FileReader reader = new FileReader("inputProducts.txt");

            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            Product currProduct;

            while (line != null) {
                String[] lineProduct = line.split(" ");
                String productName = lineProduct[0];
                double productPrice = Double.parseDouble(lineProduct[1]);

                currProduct = new Product(productName,productPrice);
                products.add(currProduct);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        }catch (FileNotFoundException ex){
            System.out.println("Not such file found.");
        }

        products.stream()
                .sorted((p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()))
                .forEach(pro-> System.out.printf("%.2f %s\n", pro.getPrice(),pro.getName()));
    }
}
