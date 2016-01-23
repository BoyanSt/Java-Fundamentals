
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem_08_SumNumbersFromTextFile {
    public static void main(String[] args) throws IOException{
        try{
            FileReader reader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String number = bufferedReader.readLine();
            int sum = 0;

            while(number!=null){
                sum+=Integer.parseInt(number);
                number = bufferedReader.readLine();
            }
            System.out.println(sum);
            bufferedReader.close();
        }catch (FileNotFoundException ex){
            System.out.println("Error");
        }
    }
}
