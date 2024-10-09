package model.functional.abilities;

import model.OnBoard;
import model.card.Deck;
import model.card.HeroCard;


public class Add2Card extends Abilities{

    public Add2Card() {
    }

    @Override
    public void action(HeroCard target) {
        Deck handle = OnBoard.getBoard().getActivePlayer().getHandle();
        handle.addCard(OnBoard.getBoard().getMainDeck().randomizeWithdrawCard());
        handle.addCard(OnBoard.getBoard().getMainDeck().randomizeWithdrawCard());
        System.out.println("this");
    }
    
}
