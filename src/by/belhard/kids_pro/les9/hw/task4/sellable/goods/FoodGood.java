package by.belhard.kids_pro.les9.hw.task4.sellable.goods;

import java.time.LocalDate;

public class FoodGood extends Good {

    private final FoodGoodType type;

    public FoodGood(String title, int cost, LocalDate date, FoodGoodType type) {
        super(title, cost, date);
        this.type = type;
    }

    @Override
    public String toString() {
        return "FoodGood{" +
                "type=" + type +
                "} " + super.toString();
    }
}
