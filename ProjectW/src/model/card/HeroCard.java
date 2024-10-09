package model.card;

import model.functional.effects.Effects;

public class HeroCard extends Card{
    private int attackPoint;
    private int defendPoint;
    private EquipmentCard equipment;
    private Effects effect;

    public HeroCard() {
    }

    public HeroCard(int attackPoint, int defendPoint, String name, int price) {
        super(name, price);
        this.attackPoint = attackPoint;
        this.defendPoint = defendPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getDefendPoint() {
        return defendPoint;
    }

    public void setDefendPoint(int defendPoint) {
        this.defendPoint = defendPoint;
    }

    public EquipmentCard getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentCard equipment) {
        this.equipment = equipment;
    }

    public Effects getEffect() {
        return effect;
    }

    public void setEffect(Effects effect) {
        this.effect = effect;
    }
    
    @Override
    public void action(HeroCard target) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
