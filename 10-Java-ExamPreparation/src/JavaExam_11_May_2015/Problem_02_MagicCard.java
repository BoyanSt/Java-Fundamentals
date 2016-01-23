package JavaExam_11_May_2015;

import java.util.Scanner;

public class Problem_02_MagicCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cardsInput = scanner.nextLine().split(" ");
        String oddOrEven = scanner.nextLine();
        String specialCard = scanner.nextLine();

        String[] cardsToCalculate = new String[(int)Math.ceil(cardsInput.length/2.0)];

        for (int i = 0,countEven=0,countOdd=0; i < cardsInput.length; i++) {
            String currCard = cardsInput[i];

            if (oddOrEven.equals("even")&&i%2==0){
                cardsToCalculate[countEven]=currCard;
                countEven++;
            } else if (oddOrEven.equals("odd")&&i%2==1){
                cardsToCalculate[countOdd]=currCard;
                countOdd++;
            }
        }
        Integer sumCards = calculCards(specialCard, cardsToCalculate);
        System.out.println(sumCards);
    }

    private static Integer calculCards(String specialCard, String[] cardsToCalculate) {

        Integer sumCards = 0;

        for (String card : cardsToCalculate) {
            String cardFace = null;
            String cardSuit = null;

            if (card.length()==3){
                cardFace = card.substring(0,2);
                cardSuit = card.substring(2);
            }else{
                cardFace = card.substring(0,1);
                cardSuit = card.substring(1);
            }

            Integer specialCardIndex = 1;

            if (specialCard.contains(cardFace)){
                specialCardIndex = 3;
            } else if (specialCard.contains(cardSuit)){
                specialCardIndex = 2;
            }

            switch (cardFace){
                case "1": sumCards += 10*specialCardIndex; break;
                case "2": sumCards += 20*specialCardIndex; break;
                case "3": sumCards += 30*specialCardIndex; break;
                case "4": sumCards += 40*specialCardIndex; break;
                case "5": sumCards += 50*specialCardIndex; break;
                case "6": sumCards += 60*specialCardIndex; break;
                case "7": sumCards += 70*specialCardIndex; break;
                case "8": sumCards += 80*specialCardIndex; break;
                case "9": sumCards += 90*specialCardIndex; break;
                case "10": sumCards += 100*specialCardIndex; break;
                case "J": sumCards += 120*specialCardIndex; break;
                case "Q": sumCards += 130*specialCardIndex; break;
                case "K": sumCards += 140*specialCardIndex; break;
                case "A": sumCards += 150*specialCardIndex; break;
            }
        }
        return sumCards;
    }
}
