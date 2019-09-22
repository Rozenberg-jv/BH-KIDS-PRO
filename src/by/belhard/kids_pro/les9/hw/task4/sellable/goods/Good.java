package by.belhard.kids_pro.les9.hw.task4.sellable.goods;

import by.belhard.kids_pro.les9.hw.task4.sellable.Sellable;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Good implements Sellable {

    private final String title;

    private final int cost;

    private final LocalDate date;

    public Good(String title, int cost, LocalDate date) {
        this.title = title;
        this.cost = cost;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return title + ", " + cost + " p., " + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return title.equals(good.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
