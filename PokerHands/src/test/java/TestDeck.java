import com.cardgames.cards.Card;
import com.cardgames.cards.Deck;
import com.cardgames.cards.Rank;
import com.cardgames.cards.Suit;
import java.util.stream.IntStream;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;



public class TestDeck {

    @Test
    public void testDeckSize() {
        final Deck deck = Deck.newUnshuffledSingleDeck();
        assertEquals(deck.size(), 52);
        IntStream.range(0, 52).forEach(i->deck.deal());
        assertEquals(deck.size(), 0);
    }

    @Test
    public void testDeckContains() {
        final Deck deck = Deck.newShuffledSingleDeck();
        assertEquals(deck.size(), 52);
        assertTrue(deck.contains(new Card(Rank.ACE, Suit.SPADES)));
        IntStream.range(0, 52).forEach(i->deck.deal());
        assertEquals(deck.size(), 0);
        assertFalse(deck.contains(new Card(Rank.ACE, Suit.SPADES)));
    }

}