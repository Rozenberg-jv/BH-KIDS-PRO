package by.belhard.kids_pro.les3.shop;

import by.belhard.kids_pro.les3.good.AbstractGood;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractShop {

    private List<AbstractGood> assortment = new ArrayList<>();

    public void addGoodToAssortment(AbstractGood good) {
        assortment.add(good);
    }

    public abstract void greeting();

    public AbstractGood sell(int index) {
        return assortment.get(index);
    }
}
