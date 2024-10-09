package model.functional.passives;

import model.card.HeroCard;

public abstract class Passives {
    private String description;

    public Passives() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void action(HeroCard target);
}