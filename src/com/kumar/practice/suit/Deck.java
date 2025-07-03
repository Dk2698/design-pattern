package com.kumar.practice.suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    // Placeholder: Human-style shuffle simulation
    public void humanLikeShuffle() {
        int middle = cards.size() / 2;
        List<Card> firstHalf = new ArrayList<>(cards.subList(0, middle));
        List<Card> secondHalf = new ArrayList<>(cards.subList(middle, cards.size()));

        List<Card> shuffled = new ArrayList<>();
        Random rand = new Random();

        while (!firstHalf.isEmpty() || !secondHalf.isEmpty()) {
            if (!firstHalf.isEmpty() && rand.nextBoolean()) {
                shuffled.add(firstHalf.remove(0));
            }
            if (!secondHalf.isEmpty()) {
                shuffled.add(secondHalf.remove(0));
            }
        }

        cards.clear();
        cards.addAll(shuffled);
    }
}
