package by.belhard.kids_pro.les3;

import by.belhard.kids_pro.les3.good.Ball;
import by.belhard.kids_pro.les3.good.Butter;
import by.belhard.kids_pro.les3.good.Milk;
import by.belhard.kids_pro.les3.shop.AbstractShop;
import by.belhard.kids_pro.les3.shop.FoodShop;
import by.belhard.kids_pro.les3.shop.SportsShop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<AbstractShop> shops = new ArrayList<>();

        AbstractShop foodShop = new FoodShop();
        foodShop.addGoodToAssortment(new Milk("Milk 1", 10, 0.25));
        foodShop.addGoodToAssortment(new Butter("Butter 1", 15, 0.65));

        AbstractShop sportShop = new SportsShop();
        sportShop.addGoodToAssortment(new Ball("Ball 1", 55, "leather"));

        shops.add(foodShop);
        shops.add(sportShop);

        AbstractShop getShopZero = shops.get(0);
        AbstractShop getShopOne = shops.get(1);

        getShopZero.greeting();
        getShopOne.greeting();

        System.out.println(getShopZero.sell(0));
        System.out.println(getShopZero.sell(1));
    }
}
