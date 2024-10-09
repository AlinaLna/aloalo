package model.functional.abilities;

import model.card.HeroCard;

public abstract class Abilities {
    
    private String description;
    
    public Abilities() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public abstract void action(HeroCard target);
}
