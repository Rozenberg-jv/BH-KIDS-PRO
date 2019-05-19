package by.belhard.kids_pro.les6.battlegame;

public class Knight extends AbstractUnit {

    private static final int KNIGHT_BLOCK_ABILITY_CHANCE = 10;

    public Knight(int maxHealth, int armor, Weapon weapon) {
        super(maxHealth, armor, weapon);
    }

    @Override
    public boolean attack(AbstractUnit target) {

        int damage = this.getWeapon().getDamage();

        return target.takeDamage(damage);
    }

    @Override
    public int countBlock() {

        return RandomUtil.random(101) <= KNIGHT_BLOCK_ABILITY_CHANCE
                ? 100 : super.countBlock();
    }
}
