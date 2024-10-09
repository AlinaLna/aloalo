package model.card;

public abstract class Card {
    private String name;
    private int price;
    // Constructor
    public Card() {
    }
    
    public Card(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    // Abstract methods to be implemented by subclasses
    public abstract void action(HeroCard target);

    public abstract void display();
}