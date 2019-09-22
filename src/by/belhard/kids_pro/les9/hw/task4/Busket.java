package by.belhard.kids_pro.les9.hw.task4;

import by.belhard.kids_pro.les9.hw.task4.sellable.Sellable;

import java.util.HashMap;
import java.util.Map;

public class Busket {

    private Map<Sellable, Integer> basket = new HashMap<>();

    public void putIntoBasket(Sellable item) {

        if (basket.containsKey(item))
            basket.put(item, basket.get(item) + 1);
        else
            basket.put(item, 1);
    }

    public int getCost() {

        int sum = 0;

        for (Map.Entry<Sellable, Integer> e : basket.entrySet()) {

            sum += e.getKey().getCost() * e.getValue();
        }

        return sum;
    }
}
