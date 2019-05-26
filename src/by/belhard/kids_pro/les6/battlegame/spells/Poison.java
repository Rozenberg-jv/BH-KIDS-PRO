package by.belhard.kids_pro.les6.battlegame.spells;

import by.belhard.kids_pro.les6.battlegame.RandomUtil;

public class Poison implements OverTimeSpell {

    private int minDamage;
    private int maxDamage;

    private int counter;

    public Poison(int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.counter = 2;
    }

    public int getDamage() {

        counter--;

        int resultDamage = minDamage +
                RandomUtil.random(maxDamage - minDamage + 1);

        return resultDamage;
    }

    public int getCounter() {
        return counter;
    }
}
