
package controller;

import java.util.Random;
import model.Player;
import view.Utils;
import model.OnBoard;


public class Gameplay {
    
    public void addCardToHand() {
        for (int i = 0; i < 5; i++) {
            OnBoard.getBoard().getActivePlayer().getHandle().addCard(OnBoard.getBoard().getMainDeck().randomizeWithdrawCard());
            OnBoard.getBoard().getOpponentPlayer().getHandle().addCard(OnBoard.getBoard().getMainDeck().randomizeWithdrawCard());
        }
    }
    
    public void addCardEachRoundForActivePlayer(){
        
    }
    
    public void addCardEachRoundForOpponentPlayer(){
        
    }
    public void swap(Player p1, Player p2){
        
    }
    
    public void round1(){
        String name_player1 = Utils.getValue("TYPE YOUR NAME: ");
        OnBoard.getBoard().getActivePlayer().setName(name_player1);
        String name_player2 = Utils.getValue("TYPE YOUR NAME: ");
        OnBoard.getBoard().getOpponentPlayer().setName(name_player2);
        addCardToHand();
        
        System.out.println("Starting battle!!");
        System.out.println("Round 1, you cannot attack!!!");
        
    }
    
    public void startGame(){
        while(OnBoard.getBoard().getActivePlayer().getHealthPoint() == 0 || OnBoard.getBoard().getOpponentPlayer().getHealthPoint() == 0){
            /* Player1 đánh trước
            Tạo hàm cho người dùng nhập câu lệnh với 3 ẩn : String int int
            */        
        }
        
    }
    
}
