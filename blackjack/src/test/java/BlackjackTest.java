import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.blackjack.Blackjack;
import com.blackjack.CardDeck;

public class BlackjackTest {
    @Test
    void testCardDeck() {
        CardDeck newDeck = new CardDeck();
        assertEquals(52, newDeck.getSize());

    }
    @Test
    void testCardDeckDraw() {
        CardDeck newDeck = new CardDeck();
        newDeck.drawCard();
        assertEquals(51, newDeck.getSize());
    }
    @Test
    void testBlackjackGame() {
        Blackjack game = new Blackjack(1);
        assertEquals(1, game.getPlayers());
    }
    @Test
    void testCardIdToString() {
        Blackjack game = new Blackjack(1);
        assertEquals("Ace of Hearts", game.cardIdToString(0));
        assertEquals("King of Hearts", game.cardIdToString(12));
    }
}
