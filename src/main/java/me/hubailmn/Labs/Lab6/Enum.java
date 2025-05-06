package me.hubailmn.Labs.Lab6;

import lombok.Getter;
import me.hubailmn.utils.Exercise;

@Exercise(
        name = "Card Deck Enum",
        description = "Observing The Enum Class and its methods. "
)
public class Enum {
    /**
     * An enumeration of card suits.
     */
    @Getter
    enum Suit {
        DIAMONDS("red"),
        HEARTS("red"),
        CLUBS("black"),
        SPADES("black");

        private final String color;

        Suit(String suitColor) {
            color = suitColor;
        }

    }

    public static void main(String[] args) {
        Suit cardSuit = Suit.CLUBS;
        System.out.println(cardSuit.ordinal());
        System.out.println(cardSuit.equals(Suit.CLUBS));
        System.out.println(cardSuit.compareTo(Suit.CLUBS));
        System.out.println(Suit.valueOf("CLUBS"));
        System.out.println(Suit.valueOf(cardSuit.toString()));
        System.out.println(cardSuit.getColor());
        System.out.println(cardSuit.toString());
    }
}