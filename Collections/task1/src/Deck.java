import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    public Deck() {
        this.deck=new LinkedList<Card>();
        for (String suit : suits) {
            for (int i = 2; i <= 10; i++)
                deck.add(new Card<Integer, String>(i, suit));
            deck.add(new Card<String, String>("Ace", suit));
            deck.add(new Card<String, String>("Jack", suit));
            deck.add(new Card<String, String>("Queen", suit));
            deck.add(new Card<String, String>("King", suit));

/* TODO 
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/        }
    }

    public Card dealCard(){
        int size = deck.size();
        Random rand = new Random();
        int random = rand.nextInt(size);
        return deck.remove(random);

/* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */
    }

    public int size(){/* TODO: Return the size of the deck (number of cards left in it)*/
        return deck.size();
    }
    @Override
    public Iterator<Card> iterator() {
        Deck newD = new Deck();
        DeckIterator iter = new DeckIterator(newD);

        return iter;


       /* TODO
Return a new DeckIterator with this instance in the constructor.*/
    }
}
