package model.card;

import model.functional.passives.Passives;

public class EquipmentCard extends Card {

    private int attackPoint;
    private int defendPoint;
    private Passives passive;   

    public EquipmentCard(String name, int price, int attackPoint, int defendPoint, Passives passive) {
        super(name, price);
        this.attackPoint = attackPoint;
        this.defendPoint = defendPoint;
        this.passive = passive;
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

    public Passives getPassive() {
        return passive;
    }

    public void setPassive(Passives passive) {
        this.passive = passive;
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
