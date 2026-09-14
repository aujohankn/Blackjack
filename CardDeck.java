import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    ArrayList<Integer> cards = new ArrayList<Integer>();

    public CardDeck() {
        // start with all cards in deck
        for (int i = 1; i <= 52; i++) {
            cards.add(i);
        }
        // initial shuffle
        Collections.shuffle(cards);
    }
}
