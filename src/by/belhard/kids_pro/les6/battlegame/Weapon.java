package by.belhard.kids_pro.les6.battlegame;

public class Weapon {

    private String title;

    private int minDamage;
    private int maxDamage;

    public Weapon(String title, int minDamage, int maxDamage) {
        this.title = title;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int getDamage() {

        return minDamage + RandomUtil.random(maxDamage - minDamage + 1);
    }

    @Override
    public String toString() {
        return "Weapon{" + title + ", " + minDamage + "-" + maxDamage + '}';
    }
}
