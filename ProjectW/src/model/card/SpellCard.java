package model.card;

import model.functional.abilities.Abilities;

public class SpellCard extends Card{
    private Abilities ability;

    public SpellCard(String name, int price, Abilities ability) {
        super(name, price);
        this.ability = ability;
    }

    public Abilities getAbility() {
        return ability;
    }

    public void setAbility(Abilities ability) {
        this.ability = ability;
    }
    
    @Override
    public void action(HeroCard target) {
        this.ability.action(target);
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
