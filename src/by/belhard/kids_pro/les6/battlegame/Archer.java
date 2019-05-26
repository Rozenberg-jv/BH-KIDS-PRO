package by.belhard.kids_pro.les6.battlegame;

public class Archer extends AbstractUnit {

    private static final int ARCHER_CRITICAL_DAMAGE_CHANCE = 10;
    private static final int ARCHER_CRITICAL_DAMAGE_MODIFIER = 2;

    public Archer(String name, int maxHealth, int armor, Weapon weapon) {
        super(name, maxHealth, armor, weapon);
    }

    @Override
    public int attack(AbstractUnit target) {

        int damage = this.getWeapon().getDamage() *
                RandomUtil.random(101) <= ARCHER_CRITICAL_DAMAGE_CHANCE
                ? ARCHER_CRITICAL_DAMAGE_MODIFIER : 1;

        return target.takeDamage(damage);
    }
}
