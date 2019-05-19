package by.belhard.kids_pro.les6.battlegame;

import by.belhard.kids_pro.les6.battlegame.spells.Poison;
import by.belhard.kids_pro.les6.battlegame.spells.Spell;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUnit {

    private static final int STANDARD_BLOCK_AMOUNT_PERCENT = 50;

    private int maxHealth;
    private int currentHealth;

    private int armor;

    private Weapon weapon;

    private List<Poison> poisons = new ArrayList<>();

    public AbstractUnit(int maxHealth, int armor, Weapon weapon) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.armor = armor;
        this.weapon = weapon;
    }

    public abstract boolean attack(AbstractUnit target);

    public int countBlock() {

        return (RandomUtil.random(101) < armor)
                ? STANDARD_BLOCK_AMOUNT_PERCENT : 0;
    }

    public boolean takeDamage(int damage) {

        int block = countBlock();

        int resultDamage = (int) (damage - damage * ((double) block / 100));

        this.currentHealth -= resultDamage;

        boolean isAlive = currentHealth > 0;

        return isAlive;
    }

    public List<Poison> getPoisons() {
        return poisons;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    protected void affect(Poison spell) {
        poisons.add(spell);
    }
}
