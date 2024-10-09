package model.functional.effects;

import model.card.HeroCard;

public abstract class Effects {
    private String description;

    public Effects() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public abstract void action(HeroCard target);
}
