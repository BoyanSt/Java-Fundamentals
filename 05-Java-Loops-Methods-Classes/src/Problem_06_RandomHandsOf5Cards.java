import java.util.Random;
import java.util.Scanner;

public class Problem_06_RandomHandsOf5Cards {
    public static void main(String[] args) {
        Random rdm = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] suits = new String[]{"\u2660", "\u2665", "\u2666", "\u2663"};
        String[] faces = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int cardNum = scanner.nextInt();

        for (int i = 0; i < cardNum ; i++) {
            String format = "%s%s %s%s %s%s %s%s %s%s";
            String currRandomCard = String.format(format,faces[rdm.nextInt(faces.length)],suits[rdm.nextInt(suits.length)],
                                                         faces[rdm.nextInt(faces.length)],suits[rdm.nextInt(suits.length)],
                                                         faces[rdm.nextInt(faces.length)],suits[rdm.nextInt(suits.length)],
                                                         faces[rdm.nextInt(faces.length)],suits[rdm.nextInt(suits.length)],
                                                         faces[rdm.nextInt(faces.length)],suits[rdm.nextInt(suits.length)]);
            System.out.println(currRandomCard);
        }
    }
}
