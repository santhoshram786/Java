import com.cardgames.cards.Card;
import com.cardgames.cards.Rank;
import com.cardgames.cards.Suit;
import com.cardgames.poker.shared.ClassificationRank;
import com.cardgames.poker.holdem.HoldemHand;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


public class TestHoldemHandIdentification {

    @Test
    public void testIdentifyStraight() {

        final HoldemHand.Builder builder = new HoldemHand.Builder();

        final Set<Optional<Card>> communityCards = new HashSet<>();
        communityCards.add(Optional.of(new Card(Rank.THREE, Suit.DIAMONDS)));
        communityCards.add(Optional.of(new Card(Rank.NINE, Suit.HEARTS)));
        communityCards.add(Optional.of(new Card(Rank.JACK, Suit.CLUBS)));
        communityCards.add(Optional.of(new Card(Rank.TEN, Suit.SPADES)));
        communityCards.add(Optional.of(new Card(Rank.QUEEN, Suit.HEARTS)));

        builder.addHoleCard(Optional.of(new Card(Rank.ACE, Suit.SPADES)));
        builder.addHoleCard(Optional.of(new Card(Rank.KING, Suit.DIAMONDS)));
        builder.addCommunityCards(communityCards);

        final HoldemHand hand = builder.build();

        assertEquals(hand.getHandAnalyzer().getClassification().getClassificationRank(), ClassificationRank.STRAIGHT);
    }

    @Test
    public void testFullHouse() {

        final HoldemHand.Builder builder = new HoldemHand.Builder();

        final Set<Optional<Card>> communityCards = new HashSet<>();
        communityCards.add(Optional.of(new Card(Rank.THREE, Suit.DIAMONDS)));
        communityCards.add(Optional.of(new Card(Rank.THREE, Suit.HEARTS)));
        communityCards.add(Optional.of(new Card(Rank.THREE, Suit.CLUBS)));
        communityCards.add(Optional.of(new Card(Rank.TEN, Suit.CLUBS)));
        communityCards.add(Optional.of(new Card(Rank.QUEEN, Suit.HEARTS)));

        builder.addHoleCard(Optional.of(new Card(Rank.TEN, Suit.SPADES)));
        builder.addHoleCard(Optional.of(new Card(Rank.TEN, Suit.DIAMONDS)));
        builder.addCommunityCards(communityCards);

        final HoldemHand hand = builder.build();

        assertEquals(hand.getHandAnalyzer().getClassification().getClassificationRank(), ClassificationRank.FULL_HOUSE);
    }


}
