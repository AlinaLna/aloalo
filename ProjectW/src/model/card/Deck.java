package model.card;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    public Deck() {
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }
    
    public void addCard(Card card){
        deck.add(card);
    }
    
    public Card selectionWithdrawCard(int index){
        Card card = deck.get(index);
        deck.remove(index);
        return card;
    }
    
    public Card randomizeWithdrawCard(){
        Random rand = new Random();
        int randIndex = rand.nextInt(deck.size());
        Card card = deck.get(randIndex);
        deck.remove(randIndex);
        return card;
    }
}
