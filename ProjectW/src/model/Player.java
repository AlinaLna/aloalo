package model;

import model.card.Deck;
import java.util.ArrayList;
import model.card.HeroCard;

public class Player {
    private String name;
    private int healthPoint = 20;
    private int manaPoint = 10;
    private Deck handle = new Deck();
    private ArrayList<HeroCard> offHandle = new ArrayList<>();

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getManaPoint() {
        return manaPoint;
    }

    public void setManaPoint(int manaPoint) {
        this.manaPoint = manaPoint;
    }

    public Deck getHandle() {
        return handle;
    }

    public void setHandle(Deck handle) {
        this.handle = handle;
    }  

    public void displayHP(){
        System.out.println(this.name + "'s HP: " + this.healthPoint);
    }
    public void displayMP(){
        System.out.println(this.name + "'s MP: " + this.manaPoint);
    }
    public void displayHandle(){
        for(var card: handle.getDeck()){
            System.out.println(card.getName());
        }
    }
}