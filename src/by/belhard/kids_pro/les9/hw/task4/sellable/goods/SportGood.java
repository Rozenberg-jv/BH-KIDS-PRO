package by.belhard.kids_pro.les9.hw.task4.sellable.goods;

import java.time.LocalDate;

public class SportGood extends Good {

    private final SportGoodType type;

    public SportGood(String title, int cost, LocalDate date, SportGoodType type) {
        super(title, cost, date);
        this.type = type;
    }

    @Override
    public String toString() {
        return "SportGood{" +
                "type=" + type +
                "} " + super.toString();
    }
}
