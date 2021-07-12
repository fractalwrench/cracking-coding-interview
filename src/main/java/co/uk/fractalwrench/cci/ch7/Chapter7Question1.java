package co.uk.fractalwrench.cci.ch7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter7Question1 {

    /*
     * Question: Design the data structures for a generic deck of cards. Explain how to subclass the data structures
     * to implement blackjack.
     *
     * Answer: First, let's consider the properties of a deck of cards:
     *
     * Each card belongs to a number: Ace (low), 2-10, Jester, Queen, King, Ace (high).
     * Each card also belongs to a suite: Spades, Clubs, Hearts, Diamonds.
     * Each suite has a color: black or red.
     * Finally, a deck of cards may also contain a Joker. This is important as it shows the contents of a deck of cards
     * can vary.
     *
     * The suite is a finite set of values so can be implemented as an enum named CardSuite. The color can also
     * be represented as a separate enum which is a property of the CardSuite - this is preferable to a boolean
     * property as it is more descriptive.
     *
     * The card number can also be represented as an enum named CardNumber as it is a finite set of values. As the
     * behaviour of the Ace varies depending on the game, the game itself will be responsible for recording whether
     * the ace is considered high or low, rather than the enum.
     *
     * These properties are brought together using composition in the Card class. A function is then used to
     * construct a standard deck containing 4 of each number with a different suite. If a card deck needs to hold state
     * or has special behaviour, then it may be worth encapsulating this in a class.
     *
     * I am not particularly familiar with the rules of blackjack but believe that composition should be much
     * preferred over inheritance as it avoids messy hierarchies - behaviour should therefore be added to decorator
     * classes which wrap the originals. If this were not possible/undesirable due to performance or other reasons
     * then the Card class would be subclassed and functions could be added - for example, to return the card's int
     * value.
     */

    public enum SuiteColor {
        BLACK,
        RED
    }

    public enum CardSuite {
        CLUBS(SuiteColor.BLACK, 0),
        DIAMONDS(SuiteColor.RED, 1),
        HEARTS(SuiteColor.RED, 2),
        SPADES(SuiteColor.BLACK, 3);

        private final SuiteColor color;
        private final int priority;

        CardSuite(SuiteColor color, int priority) {
            this.color = color;
            this.priority = priority;
        }

        public SuiteColor getColor() {
            return color;
        }

        public int getPriority() {
            return priority;
        }
    }

    public enum CardNumber {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JESTER,
        QUEEN,
        KING,
        JOKER,
    }

    public static class Card {
        private final CardSuite cardSuite;
        private final CardNumber cardNumber;

        Card(CardSuite cardSuite, CardNumber cardNumber) {
            this.cardSuite = cardSuite;
            this.cardNumber = cardNumber;
        }

        public CardSuite getCardSuite() {
            return cardSuite;
        }

        public CardNumber getCardNumber() {
            return cardNumber;
        }
    }

    public static List<Card> generateDeckOfCards() {
        List<Card> deck = new ArrayList<>();

        for (CardSuite suite : CardSuite.values()) {
            for (CardNumber number : CardNumber.values()) {
                deck.add(new Card(suite, number));
            }
        }
        Collections.shuffle(deck); // shuffle the deck
        return deck;
    }
}
