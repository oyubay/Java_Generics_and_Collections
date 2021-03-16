import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card card :d){
            System.out.println(card);
            /* TODO
Compete a for loop that prints every card
in the deck d */
        }

    }

    public static int addCards(ArrayList<Card> hand){
        int sum=0;
        for (Card c:hand){

            if (c.getValue().equals("Ace")){
                sum+=1;
            }else if (c.getValue().equals("Jack")){
                sum+=11;
            }else if (c.getValue().equals("Queen")){
                sum+=12;
            }else if (c.getValue().equals("King")){
                sum+=13;
            }else{
                sum+=(int) c.getValue();
            }
        }
        return sum;
 /* TODO 
This should compute the sum of values of the cards in an ArrayList of cards.*/
    }
}