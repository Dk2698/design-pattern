package com.kumar.practice.suit;

public class Main {

        public static void main(String[] args) {
            Deck deck = new Deck();

            System.out.println("=== Original Deck ===");
            deck.printDeck();

            System.out.println("\n=== Shuffled Deck ===");
            deck.shuffle();
            deck.printDeck();

            System.out.println("\n=== Human-like Shuffle Deck ===");
            deck.humanLikeShuffle();
            deck.printDeck();
        }
}
