package controller;

import view.Utils;
import model.OnBoard;
import model.Player;
import model.card.HeroCard;
import model.card.SpellCard;
import model.functional.abilities.Add2Card;
import view.gui.PlayerGUI;

public class Main {
    public static void main(String[] args) {
//        OnBoard.getBoard().setActivePlayer(new Player("Khoa"));  
//        
//        SpellCard card1 = new SpellCard("Spell1",2,new Add2Card());
//        SpellCard card2 = new SpellCard("Spell2",2,new Add2Card());
//        SpellCard card3 = new SpellCard("Spell3",2,new Add2Card());
//
//        spell testing
//        OnBoard.getBoard().getActivePlayer().getHandle().addCard(card1);
//        OnBoard.getBoard().getMainDeck().addCard(card2);
//        OnBoard.getBoard().getMainDeck().addCard(card3);
//        
//        OnBoard.getBoard().getActivePlayer().getHandle().selectionWithdrawCard(0).action(new HeroCard());
//        System.out.println("=============");
//        OnBoard.getBoard().getActivePlayer().displayHandle();
//        System.out.println("=============");
//        System.out.println(OnBoard.getBoard().getMainDeck().getDeck().size());



        Command command = new Command();
        String action = Utils.getValue("Type your action: ");
        command.Commmand(action);
    }
    
    
    
    
}
