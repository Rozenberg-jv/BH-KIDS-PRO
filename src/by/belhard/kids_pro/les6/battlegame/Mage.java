package by.belhard.kids_pro.les6.battlegame;

import by.belhard.kids_pro.les6.battlegame.spells.Poison;

public class Mage extends AbstractUnit {

    private static final int POISON_ABILITY_CHANCE = 15;

    public Mage(int maxHealth, int armor, Weapon weapon) {
        super(maxHealth, armor, weapon);
    }

    @Override
    public boolean attack(AbstractUnit target) {

        int damage = this.getWeapon().getDamage();

        if (RandomUtil.random(101) <= POISON_ABILITY_CHANCE)
            target.affect(new Poison());

        return target.takeDamage(damage);
    }
}
