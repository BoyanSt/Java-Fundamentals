package JavaExam_8_Feb_2015;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_01_GandalfsStash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gandalfsMood = Integer.parseInt(scan.nextLine());
        String inputLine = scan.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(inputLine);

        while (matcher.find()){
            String currTypeFood = matcher.group().toLowerCase();
            switch (currTypeFood){
                case "cram" : gandalfsMood +=2; break;
                case "lembas" : gandalfsMood +=3; break;
                case "apple" : gandalfsMood +=1; break;
                case "melon" : gandalfsMood +=1; break;
                case "honeycake" : gandalfsMood +=5; break;
                case "mushrooms" : gandalfsMood -=10; break;
                default: gandalfsMood -=1; break;
            }
        }
        System.out.println(gandalfsMood);

        if (gandalfsMood<-5){
            System.out.println("Angry");
        } else if(gandalfsMood>=-5&&gandalfsMood<=0){
            System.out.println("Sad");
        } else if(gandalfsMood>=0&&gandalfsMood<=10) {
            System.out.println("Happy");
        } else if (gandalfsMood>15){
            System.out.println("Special JavaScript mood");
        }
    }
}
