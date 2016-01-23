import java.io.*;
import java.util.ArrayList;

public class Problem_10_OrderOfProducts {
    public static void main(String[] args) throws IOException{

        try{
            FileReader reader = new FileReader("Products.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();
            Product currProduct;
            ArrayList<Product> products = new ArrayList<>();

            while (line!=null){
                String[] inputLine = line.split(" ");
                String productName = inputLine[0];
                double productPrice = Double.parseDouble(inputLine[1]);
                currProduct = new Product(productName,productPrice);
                products.add(currProduct);

                line = bufferedReader.readLine();
            }

            FileReader orderReader = new FileReader("Order.txt");
            BufferedReader orderBufferedReader = new BufferedReader(orderReader);
            double totalPrice = 0;

            String orderLine = orderBufferedReader.readLine();

            while(orderLine!=null){
                String[] orderInput = orderLine.split(" ");
                String orderProdName = orderInput[1];
                double orderProdQuantity = Double.parseDouble(orderInput[0]);


                for (Product prod : products) {

                    if (prod.getName().equals(orderProdName)){
                        totalPrice += prod.getPrice()*orderProdQuantity;
                    }
                }
                orderLine = orderBufferedReader.readLine();
            }

            File fileWriter = new File("Output.txt");
            PrintStream printStream = new PrintStream(fileWriter);
            printStream.printf("%.2f",totalPrice);

            bufferedReader.close();
            orderBufferedReader.close();
            printStream.close();

        }catch (IOException ex){
            System.out.println("This file does not exist.");
        }
    }
}
