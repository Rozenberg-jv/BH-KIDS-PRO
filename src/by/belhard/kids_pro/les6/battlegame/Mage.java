package by.belhard.kids_pro.les6.battlegame;

import by.belhard.kids_pro.les6.battlegame.spells.Poison;

public class Mage extends AbstractUnit {

    private static final int POISON_ABILITY_CHANCE = 15;
    private static final int POISON_MIN_DAMAGE = 2;
    private static final int POISON_MAX_DAMAGE = 3;


    public Mage(String name, int maxHealth, int armor, Weapon weapon) {
        super(name, maxHealth, armor, weapon);
    }

    @Override
    public int attack(AbstractUnit target) {

        int damage = this.getWeapon().getDamage();

        if (RandomUtil.random(101) <= POISON_ABILITY_CHANCE)
            target.affect(
                    new Poison(POISON_MIN_DAMAGE, POISON_MAX_DAMAGE));

        return target.takeDamage(damage);
    }
}
